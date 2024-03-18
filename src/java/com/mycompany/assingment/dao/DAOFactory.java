/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assingment.dao;

import com.mycompany.assingment.dao.impl.UserDAOImpl;
/**
 *
 * @author upeksha_k
 */
public class DAOFactory {
     private static DAOFactory daoFactory;

    private DAOFactory(){

    }
    public static DAOFactory getDAOFactory(){
        if (daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOType{
        User
    }

    public SuperDAO getDAO(DAOType daoType){
        switch (daoType){

            case User:return new UserDAOImpl();

            default:return null;
        }
    }
}
