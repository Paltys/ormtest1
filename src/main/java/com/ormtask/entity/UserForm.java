package com.ormtask.entity;


import org.springframework.web.bind.annotation.ModelAttribute;


public class UserForm {

    private String name;
    private String pass;

    public UserForm(String name, String pass) {
        this.name = name;
        this.pass = pass;

    }

    public UserForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
