package com.zjh.ssmpro.handler;

import com.zjh.ssmpro.entity.Department;
import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Resums;
import com.zjh.ssmpro.service.AdminService;
import com.zjh.ssmpro.service.DepartmentService;
import com.zjh.ssmpro.service.InvitationService;
import com.zjh.ssmpro.service.ResumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


    @RequestMapping("queryAllResums")
    public List<Resums> queryAllResums(){
        List<Resums> resums = resumsService.queryAllResums();
        return resums;
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
         departmentService.updateDepartmentrById(id);
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

}
