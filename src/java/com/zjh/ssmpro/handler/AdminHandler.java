package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.*;
import com.zjh.ssmpro.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
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
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private RecruitmentService recruitmentService;
    @Autowired
    private VisitorService visitorService;
    @Autowired
    private EmployeesService employeesService;

    //部门增删改查
    @RequestMapping("addDepartmenty")
    public void addDepartment(Department department){
        department.setDate(new Date(System.currentTimeMillis()));
        departmentService.insertDepartment(department);
    }

    @RequestMapping("deleteDepartment")
    public void deleteDepartment(Integer id){
        departmentService.deleteDepartmentById(id);
    }

    @RequestMapping("updateDepartmentById")
    public void updateDepartmentById(Integer id){
         departmentService.updateDepartmentById(id);
    }

    @RequestMapping("queryAllDepartment")
    public List<Department> queryAllDepartment(){
        List<Department> departments = departmentService.queryAllDepartment();
        return departments;
    }
    @RequestMapping("queryDepartmentById")
    public void queryDepartmentrById(Integer id){
        departmentService.queryDepartmentById(id);
    }

    @RequestMapping("toRecruitmentPage")
    public String toRecruitmentPage(Integer vid,Visitor visitor,Model model){
        System.out.println(vid);
        model.addAttribute("visitor",visitor);
        System.out.println("toResumPage:"+visitor);
        List<Department> departments = departmentService.queryAllDepartment();
        model.addAttribute("departments", departments);
        System.out.println(departments);
        return "../../jsp/recruitment";
    }

    @RequestMapping("addRecruitment")
    public String addRecruitment(Recruitment recruitment, Integer departmentId,Integer positionId,Model model){
        Department department = departmentService.queryDepartmentById(departmentId);
        Position position = positionService.queryPositionById(positionId);
        recruitment.setDate(new Date(System.currentTimeMillis()));
        recruitment.setDepartment(department);
        recruitment.setPosition(position);
        recruitmentService.insertRecruitment(recruitment);
        Visitor visitor = visitorService.findVisitorByName(recruitment.getaName());
        model.addAttribute("visitor",visitor);
        return "admin/adminpage";
    }
    @RequestMapping("queryAllRecruitment")
    public List<Recruitment> queryAllRecruitment(){
        List<Recruitment> recruitment = recruitmentService.queryAllRecruitment();
        return recruitment;
    }
    //查看投递的简历
    @RequestMapping("queryResumsByType")
    public String queryResumsByType(int type,Model model){
        List<Resums> resums = resumsService.queryResumsByType(type);
        System.out.println("type为1的简历"+resums);
        model.addAttribute("resums",resums);
        return ("../../jsp/admin_showResums");
    }
    @RequestMapping("returnmenu")
    public String returnmenu(Integer vid,Model model) {
//        System.out.println("returnmenu"+vid);
//        Visitor visitor =  visitorService.queryVisitorByVid(vid);
//        model.addAttribute("visitor",visitor);
//        System.out.println(visitor);
        return "admin/adminpage";
    }

    //面试邀请增查
    @RequestMapping("toInvitationPage")
    public String toInvitationPage(int vid,Model model){
        System.out.println("跳转邀请页面的vid"+vid);
        Resums resums = resumsService.queryResumByVid(vid);
        resums.setType(2);
        resumsService.updateResumsByVid(resums);
        System.out.println("查看并通知面试后简历type设为2"+resums);
        model.addAttribute("vid",vid);
        return("../../jsp/invitation");
    }

    //面试邀请增查
    @RequestMapping("addInvitation")
    public String addInvitation(Invitation invitation,Model model){
        System.out.println("addInvitation");
        String aName = invitation.getaName();
        Visitor visitor = visitorService.findVisitorByName(aName);
        System.out.println("邀请人"+aName);
        invitation.setVid(32);
        invitation.setDate(new Date(System.currentTimeMillis()));
        invitationService.addInvitation(invitation);
        System.out.println(invitation);
        List<Resums> resums = resumsService.queryResumsByType(1);
        model.addAttribute("resums",resums);
        model.addAttribute("visitor",visitor);
        System.out.println("增加邀请返回"+visitor);
        return ("admin/adminpage");
    }

    //查看被接受或未被接受的面试邀请
    @RequestMapping("queryInvitationByType")
    public String queryInvitationByType(int type,Model model){
        List<Invitation> invitations = invitationService.queryInvitationByType(type);
        model.addAttribute("invitations",invitations);
        return "../../jsp/admin_showInvitations";
    }
    //录用
    @RequestMapping("hireEmployee")
    public String hireEmployee(int vid,Employees employees){
        Visitor visitor = visitorService.queryVisitorByVid(vid);
        employees.setName(visitor.getName());
        employees.setPassword(visitor.getPassword());
        employeesService.insertEmployees(employees);
        return "admin/adminpage";
    }

}
