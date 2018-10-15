package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Recruitment;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.entity.Visitor;
import com.zjh.ssmpro.service.InvitationService;
import com.zjh.ssmpro.service.RecruitmentService;
import com.zjh.ssmpro.service.ResumsService;
import com.zjh.ssmpro.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 18221 on 2018/10/11.
 */
@RequestMapping("visitor")
@Controller
public class EmployeeHandler {
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
            return "forward:employee/findEmployeeByNameAndPassword";
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
        public String toResumsPage(Integer vid,Visitor visitor,Model model){
        System.out.println(vid);
            model.addAttribute("visitor",visitor);
        System.out.println("toResumPage:"+visitor);
            return "../../jsp/Resums";
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
