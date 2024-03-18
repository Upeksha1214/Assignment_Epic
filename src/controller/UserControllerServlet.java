package controller;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;
import service.impl.UserServiceImpl;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/user")
public class UserControllerServlet extends HttpServlet {

    UserDAO UserDAO =(UserDAO) DAOFactory.getDAOFactory().getDAO(DAOFactory.DAOType.User);
    JsonObjectBuilder response= Json.createObjectBuilder();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_CREATED);
        JsonReader reader = Json.createReader(req.getReader());
        JsonObject jsonObject = reader.readObject();

        String userId=jsonObject.getString("id");
        String name=jsonObject.getString("name");
        String email=jsonObject.getString("email");
        int phoneNumber=jsonObject.getInt("phoneNumber");
        String password=jsonObject.getString("password");

        System.out.println(userId+" "+name+" "+email+" "+phoneNumber+" "+password);



        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json");


        try {
            boolean add = UserDAO.add(new User(userId, name, email, phoneNumber,password));

            if (add){

                resp.setStatus(HttpServletResponse.SC_CREATED);//201
                response.add("status", 200);
                response.add("message", "Successfully Added");
                response.add("data", "");
                writer.print(response.build());
                System.out.println("customer add");
            }

        } catch (SQLException throwables) {
            resp.setStatus(HttpServletResponse.SC_CREATED);//201
            response.add("status", 400);
            response.add("message", "Error");
            response.add("data",throwables.getLocalizedMessage());
            writer.print(response.build());




            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_CREATED);//201
            response.add("status", 400);
            response.add("message", "Error");
            response.add("data", e.getLocalizedMessage());
            writer.print(response.build());



            e.printStackTrace();
        }
    }






    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            userBook(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void userBook(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<User> user = new UserServiceImpl().getAllUsersInfo();
        request.setAttribute("user", user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }

}
