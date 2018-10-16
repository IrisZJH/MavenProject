package com.zjh.ssmpro.test;

import com.zjh.ssmpro.dao.InvitationDao;
import com.zjh.ssmpro.entity.Invitation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class InvitationTest {
    @Autowired
    private InvitationDao invitationDao;

    @Test
    public void addInvitation(){
        Invitation invitation = new Invitation("a",32,".......",new Date(System.currentTimeMillis()),"a");
        invitationDao.insertInvitation(invitation);
        System.out.println(invitation);
    }
    @Test
    public void queryInvitationByName(){
        List<Invitation> invitations= invitationDao.queryInvitationByName("a");
        System.out.println(invitations);
    }


    @Test
    public void queryInvitationByType(){
        invitationDao.queryInvitationByType(1);
        System.out.println("ok");
    }
}
