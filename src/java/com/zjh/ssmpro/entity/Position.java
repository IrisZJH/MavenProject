package com.zjh.ssmpro.entity;

import java.util.Date;

/**
 * Created by 18221 on 2018/10/13.
 */
public class Position {
    private int id;
    private String name;
    private int Did;
    private Date date;

    public Position() {
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

    public int getDid() {
        return Did;
    }

    public void setDid(int did) {
        Did = did;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", Did=" + Did +
                ", date=" + date +
                '}';
    }
}
