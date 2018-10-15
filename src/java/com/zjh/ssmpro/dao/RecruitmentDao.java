package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Recruitment;
import com.zjh.ssmpro.entity.Resums;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Repository
public interface RecruitmentDao {
    public void insertRecruitment(Recruitment recruitment);
    public void deleteRecruitmentById(Integer id);
    public List<Recruitment> queryAllRecruitment();
}
