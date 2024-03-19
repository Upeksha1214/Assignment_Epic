/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assingment.resources.dao;

import com.mycompany.assingment.resources.model.Employee;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author upeksha_k
 */
public interface EmployeeDAO extends CrudDAO<Object, Object>{
    public abstract List<Employee> listAllEmployee() throws SQLException, ClassNotFoundException;
     
    boolean update(String id, String name, String email, String phoneNumber);
}
