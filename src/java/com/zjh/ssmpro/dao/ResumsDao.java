package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.entity.Visitor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Repository
public interface ResumsDao {
    public void insertResums(Resums resums);
    public List<Resums> queryResumsByVid(Integer vid );
    public List<Resums> queryAllResums();
    public List<Resums> queryResumsByType(int type);
}
