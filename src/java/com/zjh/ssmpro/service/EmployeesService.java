package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Employees;

/**
 * Created by 18221 on 2018/10/16.
 */
public interface EmployeesService {
    public void insertEmployees(Employees employees);
    public Employees findEmployeesByNameAndPassword(String name,String password);

}