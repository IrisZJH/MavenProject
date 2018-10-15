package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Department;
import com.zjh.ssmpro.entity.Position;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
public interface DepartmentService {
    public void insertDepartment(Department department);
    public void deleteDepartmentById(Integer id);
    public List<Department> queryAllDepartment();
    public Department queryDepartmentById(Integer id);
    public void updateDepartmentById(Integer id);
    public List<Position> findAllPosition();
}
