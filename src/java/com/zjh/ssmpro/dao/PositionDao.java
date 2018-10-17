package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Department;
import com.zjh.ssmpro.entity.Position;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Repository
public interface PositionDao {
    public void insertPosition(Position position);
    public void deletePositionById(Integer id);
    public List<Position> queryAllPosition();
    public Position queryPositionById(Integer id);
    public void updatePositionById(Integer id);
    public List<Position> queryPositionByDid(Integer Did);
}
