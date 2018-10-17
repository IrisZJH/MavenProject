package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Department;
import com.zjh.ssmpro.entity.Position;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
public interface PositionService {
    public void insertPosition(Position position);
    public void deletePositionById(Integer id);
    public List<Position> queryAllPosition();
    public Position queryPositionById(Integer id);
    public void updatePositionById(Integer id);
    public List<Position> queryPositionByDid(Integer Did);
}
