/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assingment.service;

import java.sql.SQLException;
import java.util.List;
import com.mycompany.assingment.model.User;

/**
 *
 * @author upeksha_k
 */
public interface UserService {
    public abstract List<User> getAllUsersInfo() throws SQLException;  
}
