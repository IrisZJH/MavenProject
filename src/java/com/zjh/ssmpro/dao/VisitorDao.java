package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Visitor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.servlet.annotation.WebServlet;

/**
 * Created by 18221 on 2018/10/11.
 */
@Repository
public interface VisitorDao {
    public void insertVisitor(Visitor visitor);
    public Visitor queryVisitorByNameAndPassword(@Param("name")String name, @Param("password")String password,@Param("status")int status);
    public Visitor queryVisitorByName(String name);

}
