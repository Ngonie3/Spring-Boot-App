/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.web.dto;

/**
 *
 * @author ngoni
 */
public class contactListDto {
    private String employeeName;
    private String nextOfKin;
    private String phoneNumber;
    private String Address;

    public contactListDto(String employeeName, String nextOfKin, String phoneNumber, String Address) {
        this.employeeName = employeeName;
        this.nextOfKin = nextOfKin;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
    }

    public contactListDto() {
    }
    
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
}
