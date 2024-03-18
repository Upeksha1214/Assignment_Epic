/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assingment.dao;

import com.mycompany.assingment.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author upeksha_k
 */
public interface UserDAO extends CrudDAO<Object, Object>{
    public abstract List<User> listAllUsers() throws SQLException, ClassNotFoundException;
     
     boolean update(String id, String name, String email, String phoneNumber);
}
