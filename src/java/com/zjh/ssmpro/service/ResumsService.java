package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Resums;

import java.util.List;

/**
 * Created by 18221 on 2018/10/12.
 */
public interface ResumsService {
    public void addResums(Resums resums);
    public List<Resums>  findResumsByVid(Integer vid);
    public Resums findResumsByName(String name);
    public List<Resums> queryAllResums();
    public List<Resums> queryResumsByType(int type);
}
