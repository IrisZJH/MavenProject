package com.zjh.ssmpro.entity;

import java.util.Date;

/**
 * Created by 18221 on 2018/10/13.
 */
public class Department {
    private Integer did;
    private String dname;
    private Date date;
    private Position position;

    public Department() {
    }

    public Department(String dname, Date date) {
        this.dname = dname;
        this.date = date;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", date=" + date +
                ", position=" + position +
                '}';
    }
}
