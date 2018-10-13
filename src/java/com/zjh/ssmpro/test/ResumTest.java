package com.zjh.ssmpro.test;

import com.zjh.ssmpro.dao.ResumsDao;
import com.zjh.ssmpro.dao.VisitorDao;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.entity.Visitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by 18221 on 2018/10/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ResumTest {
   @Autowired
    private ResumsDao resumsDao;

    @Test
    public void addResums(){
        Resums resums = new Resums("a","m",20,"aaaschool","1....,2...,3...,","java","computer","smart","null",1);
        resumsDao.insertResums(resums);
        System.out.println(resums);
    }
    @Test
    public void queryResumsByVid(){
        List<Resums> resums = resumsDao.queryResumsByVid(1);
        System.out.println(resums);
    }

    @Test
    public void queryAllResums(){
        List<Resums> resums = resumsDao.queryAllResums();
        System.out.println(resums);
    }
    @Test
    public void queryResumsByType(){
        List<Resums> resums = resumsDao.queryResumsByType(0);
        System.out.println(resums);
    }
}
