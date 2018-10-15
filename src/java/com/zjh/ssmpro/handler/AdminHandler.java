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

    //面试邀请增查
    @RequestMapping("addInvitation")
    public void addInvitation(Invitation invitation){
        invitationService.addInvitation(invitation);
    }

    //查看被接受或未被接受的面试邀请
    @RequestMapping("queryInvitationByType")
    public void queryInvitationByType(int type){
        invitationService.queryInvitationByType(type);
    }

}
