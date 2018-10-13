package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Department;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
public interface DepartmentService {
    public void insertDepartment(Department department);
    public void deleteDepartmentById(Integer id);
    public List<Department> queryAllDepartment();
    public Department queryDepartmentById(Integer id);
    public void updateDepartmentrById(Integer id);
}
