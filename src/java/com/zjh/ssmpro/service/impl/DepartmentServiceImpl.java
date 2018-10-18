package com.zjh.ssmpro.service.impl;

import com.zjh.ssmpro.dao.DepartmentDao;
import com.zjh.ssmpro.dao.PositionDao;
import com.zjh.ssmpro.entity.Department;
import com.zjh.ssmpro.entity.Position;
import com.zjh.ssmpro.service.DepartmentService;
import com.zjh.ssmpro.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private PositionDao positionDao;

    @Override
    public void insertDepartment(Department department) {
        departmentDao.insertDepartment(department);
    }

    @Override
    public void deleteDepartmentById(Integer id) {
        departmentDao.deleteDepartmentById(id);
    }

    @Override
    public List<Department> queryAllDepartment() {
        return departmentDao.queryAllDepartment();
    }

    @Override
    public Department queryDepartmentById(Integer id) {
        return departmentDao.queryDepartmentById(id);
    }

    @Override
    public List<Position> findAllPosition() {
        return positionDao.queryAllPosition();
    }

    @Override
    public void updateDepartmentById(Integer id) {
        departmentDao.updateDepartmentById(id);
    }
}
