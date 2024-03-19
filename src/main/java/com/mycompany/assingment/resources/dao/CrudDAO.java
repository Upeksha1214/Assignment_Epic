/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.assingment.resources.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author upeksha_k
 */
public interface CrudDAO <T, id> extends SuperDAO{
    boolean add(T t) throws SQLException, ClassNotFoundException;

    boolean delete(id id) throws SQLException, ClassNotFoundException;

    boolean update(T t) throws SQLException, ClassNotFoundException;

    T search(id id) throws SQLException, ClassNotFoundException;

    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
}
