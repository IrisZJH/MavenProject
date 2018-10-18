package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Repository
public interface DepartmentDao {
    public void insertDepartment(Department department);
    public void deleteDepartmentById(Integer id);
    public void  updateDepartmentById(Integer id);
    public List<Department> queryAllDepartment();
    public Department queryDepartmentById(Integer id);
    public Department queryDepartmentByPid(Integer id);
    public Department queryDepartmentBydname(String dname);
}
