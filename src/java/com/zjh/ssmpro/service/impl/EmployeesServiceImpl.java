package com.zjh.ssmpro.service.impl;

import com.zjh.ssmpro.dao.EmployeesDao;
import com.zjh.ssmpro.entity.Employees;
import com.zjh.ssmpro.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 18221 on 2018/10/16.
 */
@Service("employeesService")
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    private EmployeesDao employeesDao;
    @Override
    public void insertEmployees(Employees employees) {
        employeesDao.insertEmployees(employees);
    }

    @Override
    public Employees findEmployeesByNameAndPassword(String name, String password) {
        return employeesDao.queryEmployeesByNameAndPassword(name,password);
    }
}
