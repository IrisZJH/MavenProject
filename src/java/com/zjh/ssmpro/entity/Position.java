package com.zjh.ssmpro.entity;

import java.util.Date;

/**
 * Created by 18221 on 2018/10/13.
 */
public class Position {
    private Integer pid;
    private String pname;
    private Department department;
    private Date date;

    public Position() {
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", department=" + department +
                ", date=" + date +
                '}';
    }
}
