/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assingment.model;

/**
 *
 * @author upeksha_k
 */
public class User {
    private String employeeCode;
    private String firstName;
    private String password;
    private String lastName;
    private String address;
    private String NIC;
    private int mobileNo;
    private String gender;
    private String eMail;
    private String designationMasterData;
    private String dateOfBirth;
    private String status;

    public User() {
    }

    public User(String employeeCode, String firstName, String password, String lastName, String address, String NIC, int mobileNo, String gender, String eMail, String designationMasterData, String dateOfBirth, String status) {
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.password = password;
        this.lastName = lastName;
        this.address = address;
        this.NIC = NIC;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.eMail = eMail;
        this.designationMasterData = designationMasterData;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "employeeCode='" + employeeCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + address + '\'' +
                ", NIC='" + NIC + '\'' +
                ", mobileNo=" + mobileNo +
                ", gender='" + gender + '\'' +
                ", eMail='" + eMail + '\'' +
                ", designationMasterData='" + designationMasterData + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDesignationMasterData() {
        return designationMasterData;
    }

    public void setDesignationMasterData(String designationMasterData) {
        this.designationMasterData = designationMasterData;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
