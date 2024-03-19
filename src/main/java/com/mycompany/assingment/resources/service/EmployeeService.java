/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assingment.resources.service;

import com.mycompany.assingment.resources.model.Employee;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author upeksha_k
 */
public interface EmployeeService {
    public abstract List<Employee> getAllUsersInfo() throws SQLException;
}
