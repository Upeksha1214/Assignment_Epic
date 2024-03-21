/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assingment.resources.dao.impl;

import com.mycompany.assingment.resources.dao.CrudUtill;
import com.mycompany.assingment.resources.model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author upeksha_k
 */
public class EmployeeDAOImpl implements com.mycompany.assingment.resources.dao.EmployeeDAO {

    @Override
    public ArrayList<Employee> listAllEmployee() throws SQLException, ClassNotFoundException {
        ArrayList<Employee> allEmployees = new ArrayList<>();
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM registration");
        while (resultSet.next()) {
            allEmployees.add(new Employee(resultSet.getString("employeeCode"), resultSet.getString("password"), resultSet.getString("firstName"),
                    resultSet.getString("lastName"), resultSet.getString("address"), resultSet.getString("NIC"), resultSet.getInt("mobileNo"),
                    resultSet.getString("gender"), resultSet.getString("eMail"), resultSet.getString("designationMasterData"),
                    resultSet.getString("dateOfBirth"), resultSet.getString("status")));
        }
        return allEmployees;
    }

    @Override
    public boolean update(String id, String name, String email, String phoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean add(Employee e) throws SQLException, ClassNotFoundException {
        return CrudUtill.executeUpdate("INSERT INTO  registration " +
                        "('employeeCode',password,firstName,lastName,address,NIC,mobileNo,gender,email," +
                        "designationMasterData,dateOfBirth,Status) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)",
                e.getEmployeeCode(), e.getPassword(), e.getFirstName(), e.getLastName(), e.getAddress(), e.getNIC(), e.getMobileNo(), e.getGender(), e.geteMail(), e.getDesignationMasterData(), e.getDateOfBirth(), e.getStatus());
    }


    @Override
    public boolean delete(Object id) throws SQLException, ClassNotFoundException {
        return CrudUtill.executeUpdate("DELETE FROM registration WHERE 'employeeCode'=?", id);
    }

    @Override
    public boolean update(Object t) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object search(Object id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM registration WHERE 'employeeCode'=?", id);
        resultSet.next();
        return new Employee(resultSet.getString("employeeCode"), resultSet.getString("password"), resultSet.getString("firstName"),
                resultSet.getString("lastName"), resultSet.getString("address"), resultSet.getString("NIC"), resultSet.getInt("mobileNo"),
                resultSet.getString("gender"), resultSet.getString("eMail"), resultSet.getString("designationMasterData"),
                resultSet.getString("dateOfBirth"), resultSet.getString("status"));

    }

    @Override
    public ArrayList<Object> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

}
