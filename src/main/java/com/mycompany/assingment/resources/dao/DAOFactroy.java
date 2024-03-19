/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assingment.resources.dao;

import com.mycompany.assingment.resources.dao.impl.EmployeeDAOImpl;

/**
 *
 * @author upeksha_k
 */
public class DAOFactroy {
    private static DAOFactroy daoFactory;

    private DAOFactroy(){

    }
    public static DAOFactroy getDAOFactory(){
        if (daoFactory==null){
            daoFactory=new DAOFactroy();
        }
        return daoFactory;
    }

    public enum DAOType{
        Employee
    }

    public SuperDAO getDAO(DAOType daoType){
        switch (daoType){

            case Employee:return new EmployeeDAOImpl();

            default:return null;
        }
    }
}
