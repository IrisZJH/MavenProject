package com.zjh.ssmpro.entity;

import java.util.Date;

/**
 * Created by 18221 on 2018/10/13.
 */
public class Recruitment {
    private int id;
    private Department department;//部门
    private Position position;//职位
    private String describe;
    private Date date;

    public Recruitment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Recruitment{" +
                "id=" + id +
                ", department=" + department +
                ", position=" + position +
                ", describe='" + describe + '\'' +
                ", date=" + date +
                '}';
    }
}
