/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ngoni
 */

@Entity
@Table(name="contact_list")
public class Contact {
    
    @Id
    @Column(name="employee_name")
    private String employeeName;
    
    @Column(name="nextOf_Kin")
    private String nextOfKin;
    
    @Column(name="phone_number")
    private String phoneNumber;
    
    @Column(name="address")
    private String address;

    public Contact() {
    }

    public Contact(String employeeName, String nextOfKin, String phoneNumber, String address) {
        this.employeeName = employeeName;
        this.nextOfKin = nextOfKin;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }    
}
