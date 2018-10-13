package com.zjh.ssmpro.test;

import com.zjh.ssmpro.dao.DepartmentDao;
import com.zjh.ssmpro.dao.InvitationDao;
import com.zjh.ssmpro.entity.Department;
import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.service.InvitationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by 18221 on 2018/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class AdminTest {
    @Autowired
    private DepartmentDao departmentDao;

    @Test
    public void addDepartment(){
        Department department = new Department("人事部",new Date(System.currentTimeMillis()));
        departmentDao.insertDepartment(department);
    }
}
