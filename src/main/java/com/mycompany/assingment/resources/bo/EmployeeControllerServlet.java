/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assingment.resources.bo;
import com.mycompany.assingment.resources.dao.EmployeeDAO;
import com.mycompany.assingment.resources.dao.DAOFactroy;
import com.mycompany.assingment.resources.model.Employee;
import com.mycompany.assingment.resources.service.impl.EmployeeServiceImpl;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonReader;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author upeksha_k
 */

@WebServlet(urlPatterns ="/Employee")
public class EmployeeControllerServlet extends HttpServlet{
    EmployeeDAO employeeDAO =(EmployeeDAO) DAOFactroy.getDAOFactory().getDAO(DAOFactroy.DAOType.Employee);
    JsonObjectBuilder response= Json.createObjectBuilder();
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_CREATED);
        JsonReader reader = Json.createReader(req.getReader());
        JsonObject jsonObject = reader.readObject();

        String employeeCode=jsonObject.getString("employeeCode");
        String firstName=jsonObject.getString("firstName");
        String password=jsonObject.getString("password");
        String lastName=jsonObject.getString("lastName");
        String address=jsonObject.getString("address");
        String NIC=jsonObject.getString("NIC");
        int mobileNo=jsonObject.getInt("mobileNo");
        String gender=jsonObject.getString("gender");
        String eMail=jsonObject.getString("eMail");
        String designationMasterData=jsonObject.getString("designationMasterData");
        String dateOfBirth=jsonObject.getString("dateOfBirth");
        String status=jsonObject.getString("status");

        System.out.println(employeeCode+" "+firstName+" "+password+" "+lastName+" "+address+" "+NIC+" "+mobileNo+" "+gender+" "+eMail+" "+designationMasterData+" "+dateOfBirth+" "+status);



        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json");


        try {
            boolean add = employeeDAO.add(new Employee(employeeCode,firstName,password,lastName,address,NIC,mobileNo,gender,eMail,designationMasterData,dateOfBirth,status));

            if (add){

                resp.setStatus(HttpServletResponse.SC_CREATED);//201
                response.add("status", 200);
                response.add("message", "Successfully Added");
                response.add("data", "");
                writer.print(response.build());
                System.out.println("Employee add");
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
            employee(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void employee(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Employee> employee = new EmployeeServiceImpl().getAllUsersInfo();
        request.setAttribute("employee", employee);
        RequestDispatcher dispatcher = request.getRequestDispatcher("");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json");

        System.out.println(id);

        try {

            if (employeeDAO.delete(id)) {

                JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
                objectBuilder.add("status", 200);
                objectBuilder.add("data", "");
                objectBuilder.add("message", "Successfully Deleted Employee");
                writer.print(objectBuilder.build());

            } else {
                JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
                objectBuilder.add("status", 400);
                objectBuilder.add("data", "");
                objectBuilder.add("message", "Employee Delete Fail");
                writer.print(objectBuilder.build());
            }


        } catch (SQLException throwables) {
            resp.setStatus(HttpServletResponse.SC_CREATED);//201
            response.add("status", 400);
            response.add("message", "Error");
            response.add("data", throwables.getLocalizedMessage());
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
    
     @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Read parameters from request
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phoneNumber = req.getParameter("phoneNumber");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("application/json");

        // Perform update operation using DAO class method
        if (employeeDAO .update(id, name, email, phoneNumber)) {
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
            objectBuilder.add("status", 200);
            objectBuilder.add("data", "");
            objectBuilder.add("message", "Successfully Updated Employee");
            writer.print(objectBuilder.build());
        } else {
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
            objectBuilder.add("status", 400);
            objectBuilder.add("data", "");
            objectBuilder.add("message", "Employee Update Failed");
            writer.print(objectBuilder.build());
        }
    }
    
}
