package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.service.AdminService;
import com.zjh.ssmpro.service.InvitationService;
import com.zjh.ssmpro.service.ResumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@RequestMapping("admin")
@Controller
public class AdminHandler {
    @Autowired
    private AdminService adminService;
    @Autowired
    private ResumsService resumsService;
    @Autowired
    private InvitationService invitationService;


    @RequestMapping("queryAllResums")
    public List<Resums> queryAllResums(){
        List<Resums> resums = resumsService.queryAllResums();
        return resums;
    }
    @RequestMapping("addInvitation")
    public void addInvitation(Invitation invitation){
        invitationService.addInvitation(invitation);
    }
}
