package com.ormtask.entity;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "ormtest1")
public class User{
    private int id_users;
    private String name;
    private String pass_users;
    private int role_users;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users", nullable = false, unique = true)
    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    @Column(name = "name_users",nullable = false, unique = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name_users) {
        this.name = name_users;
    }

    @Column(name = "pass_users",nullable = false,  length = 45)
    public String getPass_users() {
        return pass_users;
    }

    public void setPass_users(String pass_users) {
        this.pass_users = pass_users;
    }

    @Column(name = "role_users",nullable = false)
    public int getRole_users() {
        return role_users;
    }

    public void setRole_users(int role_users) {
        this.role_users = role_users;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_users=" + id_users +
                ", name_users='" + name + '\'' +
                ", pass_users='" + pass_users + '\'' +
                ", role_users=" + role_users +
                '}';
    }
}
