package com.zjh.ssmpro.service.impl;

import com.zjh.ssmpro.dao.VisitorDao;
import com.zjh.ssmpro.entity.Visitor;
import com.zjh.ssmpro.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 18221 on 2018/10/11.
 */
@Service("visitorService")
@Transactional
public class VisitorServiceImpl implements VisitorService{
    @Autowired
    private VisitorDao visitorDao;


    @Override
    public void addVisitor(Visitor visitor) {
         visitorDao.insertVisitor(visitor);
    }

    @Override
    public Visitor findVisitorByNameAndPassword(String name, String password,Integer status) {
        return visitorDao.queryVisitorByNameAndPassword(name,password,status);
    }

    @Override
    public Visitor findVisitorByName(String name) {
        return visitorDao.queryVisitorByName(name);
    }
}
