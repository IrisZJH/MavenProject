package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Recruitment;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.entity.Visitor;
import com.zjh.ssmpro.service.InvitationService;
import com.zjh.ssmpro.service.RecruitmentService;
import com.zjh.ssmpro.service.ResumsService;
import com.zjh.ssmpro.service.VisitorService;
import javafx.scene.control.Alert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
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
    @Autowired
    private RecruitmentService recruitmentService;

    @RequestMapping("regist")
    public String register( ){
        System.out.println("regist");
        return "/visitor/regist";
    }
    @RequestMapping("login")
    public String login(Visitor visitor,Model model){
        int status = visitor.getStatus();
        model.addAttribute("visitor", visitor);
        System.out.println(status);
        if(status==0) {
            Visitor visitor1 = visitorService.findVisitorByNameAndPassword(visitor.getName(),visitor.getPassword(),visitor.getStatus());
            if (visitor1!=null){
                System.out.println("success");
                model.addAttribute("visitor", visitor1);
                System.out.println("登陆成功保存visitor:"+visitor1);
                return "../../menu";
            }else {
                model.addAttribute("str","账号或密码错误");
                return "../../index";
            }

        }if(status==1){
            Visitor visitor1 = visitorService.findVisitorByNameAndPassword(visitor.getName(),visitor.getPassword(),visitor.getStatus());
            if (visitor1!=null){
                System.out.println("success");
                model.addAttribute("visitor", visitor1);
                System.out.println("登陆成功保存visitor:"+visitor1);
                return "admin/adminpage";
            }else {
                model.addAttribute("str", "账号或密码错误");
                return "../../index";
            }
        }else{
            Visitor visitor1 = visitorService.findVisitorByNameAndPassword(visitor.getName(),visitor.getPassword(),visitor.getStatus());
            if (visitor1!=null){
                System.out.println("success");
                model.addAttribute("visitor", visitor1);
                System.out.println("登陆成功保存visitor:"+visitor1);
                return "admin/adminpage";
            }else {
                model.addAttribute("str", "账号或密码错误");
                return "../../index";
            }
        }
    }
    @RequestMapping("addVisitor")
    public String addVisitor(Visitor visitor){
       Visitor visitor1 =  visitorService.findVisitorByName(visitor.getName());
       if(visitor1==null) {
           visitorService.addVisitor(visitor);
           return "../../index";
       }else {
           return "visitor/regist";
       }
    }

//    @RequestMapping("findVisitorByNameAndPassword")
//    public String findVisitorByNameAndPassword(String name,String password,ModelMap model){
//        Visitor visitor = visitorService.findVisitorByNameAndPassword(name,password);
//        if (visitor!=null){
//            System.out.println("success");
//            return "/visitor/visitorpage";
//        }else {
//            model.addAttribute("str","账号或密码错误");
//            return "forward:visitor/regist";
//        }
//    }
    @RequestMapping("verifyUserName")
    public String verifyUserName(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("a");
        boolean b = false;
        Visitor v= visitorService.findVisitorByName(req.getParameter("name"));
        if (v!=null) {
            b=true;
        }
        resp.getWriter().print("{\"ifreg\":\""+b+"\"}");
        System.out.println("{\"ifreg\":\""+b+"\"}");
        return  "";
    }

    @RequestMapping("toResumsPage")
        public String toResumsPage(Integer id,Visitor visitor,Model model){
        Visitor visitor1 = visitorService.queryVisitorByVid(id);
        model.addAttribute("visitor",visitor1);
        List<Resums> resums = resumsService.findResumsByVid(id);
        if(resums==null) {
            model.addAttribute("visitor", visitor1);
            System.out.println("toResumPage:" + visitor1);
            return "../../jsp/Resums";
        }else{
            System.out.println("跳转回menu"+visitor1);
            return "../../menu";
        }
        }


    @RequestMapping("addResums")
    public String addResums(Resums resums,Model model){
        resumsService.addResums(resums);
        Visitor visitor = visitorService.findVisitorByName(resums.getName());
        model.addAttribute("visitor",visitor);
        return "../../menu";
    }
    @RequestMapping("queryResumsByVid")
    public String queryResumsByVid(Integer vid, Model model){
        System.out.println("vid:"+vid);
        List<Resums> resums = resumsService.findResumsByVid(vid);
        model.addAttribute("resums",resums);
        System.out.println(resums);
        return "../../jsp/showResums";
    }
    @RequestMapping("queryAllRecruitment")
    public String queryAllRecruitment(Integer vid,Model model){
        System.out.println("查看简历时的vid："+vid);
        model.addAttribute("vid",vid);
        List<Recruitment> recruitment = recruitmentService.queryAllRecruitment();
        model.addAttribute("recruitment",recruitment);
        Resums resums = resumsService.queryResumByVid(vid);
        model.addAttribute("resums",resums);
        System.out.println(resums);
        return "../../jsp/showRecruitment";
    }

    @RequestMapping("toudiResum")
    public String toudiResum(Integer vid,Model model){
        System.out.println("投递时vid:"+vid);
        Resums resums = resumsService.queryResumByVid(vid);
        resums.setType(1);
        resumsService.updateResumsByVid(resums);
        model.addAttribute("resums",resums);
        System.out.println(resums);
        List<Recruitment> recruitment = recruitmentService.queryAllRecruitment();
        model.addAttribute("recruitment",recruitment);
        return "../../jsp/showRecruitment";
    }

    @RequestMapping("queryInvitationByVid")
    public String queryInvitationByVid(Integer vid,Model model){
        List<Invitation> invitations = invitationService.queryInvitationByVid(vid);
        Visitor visitor = visitorService.queryVisitorByVid(vid);
        model.addAttribute("visitor",visitor);
        System.out.println("查询面试通知时"+visitor);
        model.addAttribute("invitations",invitations);
        return "../../jsp/showInvitations";
    }

    @RequestMapping("acceptInvitation")
    public String updateInvitationById(Integer id,Model model){
        System.out.println("acceptInvitation"+id);
        Invitation invitation = invitationService.queryInvitationById(id);
        System.out.println(invitation);
        invitation.setType(1);
        invitationService.updateInvitationById(invitation);
        List<Invitation> invitations = invitationService.queryInvitationByVid(invitation.getVid());
        model.addAttribute("invitations",invitations);
        Visitor visitor = visitorService.queryVisitorByVid(invitation.getVid());
        System.out.println("接受面试返回面试通知页"+visitor);
        model.addAttribute("visitor",visitor);
        return "../../jsp/showInvitations";
    }

    @RequestMapping("returnmenu")
        public String returnmenu(Integer vid,Model model) {
        System.out.println("returnmenu"+vid);
       Visitor visitor =  visitorService.queryVisitorByVid(vid);
       model.addAttribute("visitor",visitor);
        System.out.println(visitor);
       return "../../menu";
    }

}
