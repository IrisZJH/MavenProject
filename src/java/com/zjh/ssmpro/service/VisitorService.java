package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Visitor;

/**
 * Created by 18221 on 2018/10/11.
 */
public interface VisitorService {
    public void addVisitor(Visitor visitor);
    public Visitor findVisitorByNameAndPassword(String name,String password,Integer status);
    public Visitor findVisitorByName(String name);
}
