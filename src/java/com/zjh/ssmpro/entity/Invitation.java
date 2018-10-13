package com.zjh.ssmpro.entity;

import java.util.Date;

/**
 * Created by 18221 on 2018/10/13.
 */
public class Invitation {
    private int id;
    private String name;
    private String text;
    private Date date;
    private int type;//0未接受，1接受

    public Invitation() {
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", type=" + type +
                '}';
    }
}
