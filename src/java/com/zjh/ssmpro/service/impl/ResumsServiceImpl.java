package com.zjh.ssmpro.service.impl;

import com.zjh.ssmpro.dao.ResumsDao;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.service.ResumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 18221 on 2018/10/12.
 */
@Service("resumsService")
public class ResumsServiceImpl implements ResumsService {
    @Autowired
    private ResumsDao resumsDao;
    @Override
    public void addResums(Resums resums) {
        resumsDao.insertResums(resums);
    }

    @Override
    public Resums findResumsByVid(Integer vid) {
        return resumsDao.queryResumsByVid(vid);
    }

    @Override
    public Resums findResumsByName(String name) {
        return null;
    }

    @Override
    public List<Resums> queryAllResums() {
        return resumsDao.queryAllResums();
    }
}
