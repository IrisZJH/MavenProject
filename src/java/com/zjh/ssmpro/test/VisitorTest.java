package com.zjh.ssmpro.test;

import com.zjh.ssmpro.dao.InvitationDao;
import com.zjh.ssmpro.dao.VisitorDao;
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
public class VisitorTest {
   @Autowired
    private VisitorDao visitorDao;
   @Autowired
    private InvitationDao invitationDao;

    @Test
    public void addVisitor(){
        Visitor visitor = new Visitor(1,"b","bbb");
        visitorDao.insertVisitor(visitor);
        System.out.println(visitor);
    }
    @Test
    public void findVisitorByNameAndPassword(){
        System.out.println(visitorDao.queryVisitorByNameAndPassword("c","ccc",0));
    }


}
