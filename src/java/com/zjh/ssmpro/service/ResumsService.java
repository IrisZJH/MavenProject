package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Resums;

/**
 * Created by 18221 on 2018/10/12.
 */
public interface ResumsService {
    public void addVResums(Resums resums);
    public Resums findResumsByVid(Integer id);
    public Resums findResumsByName(String name);
}
