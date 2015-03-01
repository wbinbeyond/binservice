package com.springapp.mvc.web.vo;

import java.io.Serializable;

/**
 * Created by Bin on 3/1/2015.
 */
public class Employee implements Serializable{
    private String sid;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Employee directManager;

    public Employee getDirectManager() {
        return directManager;
    }

    public void setDirectManager(Employee directManager) {
        this.directManager = directManager;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sid='" + sid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", directManager=" + directManager +
                '}';
    }
}
