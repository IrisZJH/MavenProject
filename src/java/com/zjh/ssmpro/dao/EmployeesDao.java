package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Employees;
import com.zjh.ssmpro.entity.Visitor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 18221 on 2018/10/16.
 */
@Repository
public interface EmployeesDao {
    public void insertEmployees(Employees employees);
    public Employees queryEmployeesByNameAndPassword(@Param("name")String name, @Param("password")String password);
    public List<Employees> queryAllEmployees();
}
