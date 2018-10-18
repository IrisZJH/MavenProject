package com.zjh.ssmpro.entity;

/**
 * Created by 18221 on 2018/10/16.
 */
public class Employees {
    public int id;
    public String name;
    public String password;
    public int status;


    public Employees() {
    }

    public Employees(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
