package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {
    @Id
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String passwrod;
    public Register(String first_name, String last_name, String email, String passwrod,int id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.passwrod = passwrod;
        this.id = id;
    }
    public Register(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPasswrod() {
        return passwrod;
    }
    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    };
}
