package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.entity.Visitor;
import com.zjh.ssmpro.service.InvitationService;
import com.zjh.ssmpro.service.ResumsService;
import com.zjh.ssmpro.service.VisitorService;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 18221 on 2018/10/11.
 */
@RequestMapping("visitor")
@Controller
public class VisitorHandler {
    @Autowired
    private VisitorService visitorService;
    @Autowired
    private ResumsService resumsService;
    @Autowired
    private InvitationService invitationService;

    @RequestMapping("regist")
    public String register( ){
        return "/visitor/regist";
    }
    @RequestMapping("login")
    public String login( ){
        return "/visitor/login";
    }
    @RequestMapping("addVisitor")
    public String addVisitor(Visitor visitor){
       Visitor visitor1 =  visitorService.findVisitorByName(visitor.getName());
       if(visitor1==null) {
           visitorService.addVisitor(visitor);
           return "/visitor/login/";
       }else {
           return "/visitor/regist/";
       }
    }

    @RequestMapping("findVisitorByNameAndPassword")
    public String findVisitorByNameAndPassword(String name,String password,ModelMap model){
        Visitor visitor = visitorService.findVisitorByNameAndPassword(name,password);
        if (visitor!=null){
            System.out.println("success");
            return "/visitor/visitorpage";
        }else {
            model.addAttribute("str","账号或密码错误");
            return "forward:/visitor/regist";
        }
    }
    @RequestMapping("verifyUserName")
    public String verifyUserName(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        boolean b = false;
        Visitor v= visitorService.findVisitorByName(req.getParameter("name"));
        if (v!=null) {
            b=true;
        }
        resp.getWriter().print("{\"ifreg\":\""+b+"\"}");
        System.out.println("{\"ifreg\":\""+b+"\"}");
        return  "";
    }
    @RequestMapping("addResums")
    public void addResums(Visitor visitor, Resums resums){
        int id = visitor.getId();
        resums.setVid(id);
        resumsService.addResums(resums);
    }
    @RequestMapping("queryResumsByVid")
    public List<Resums> queryResumsByVid(Integer vid){
        List<Resums> resums = resumsService.findResumsByVid(vid);
        return resums;
    }
    @RequestMapping("queryInvitationByName")
    public List<Invitation> queryInvitationByName(String name){
        List<Invitation> invitations = invitationService.queryInvitationByName(name);
        return invitations ;
    }

    @RequestMapping("acceptInvitation")
    public void updateInvitationByName(String name){
        invitationService.updateInvitationByName(name);
    }
}
