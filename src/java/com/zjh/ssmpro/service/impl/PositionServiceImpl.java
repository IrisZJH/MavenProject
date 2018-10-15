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
@Service("positionService")
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionDao positionDao;


    @Override
    public void insertPosition(Position position) {
        positionDao.insertPosition(position);
    }

    @Override
    public void deletePositionById(Integer id) {
        positionDao.deletePositionById(id);
    }

    @Override
    public List<Position> queryAllPosition() {
        return positionDao.queryAllPosition();
    }

    @Override
    public Position queryPositionById(Integer id) {
        return positionDao.queryPositionById(id);
    }

    @Override
    public void updatePositionById(Integer id) {
        positionDao.updatePositionById(id);
    }
}
