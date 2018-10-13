package com.zjh.ssmpro.service.impl;

import com.zjh.ssmpro.dao.RecruitmentDao;
import com.zjh.ssmpro.entity.Recruitment;
import com.zjh.ssmpro.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Service("recruitmentService")
public class RecruitmentServiceImpl implements RecruitmentService {
    @Autowired
    private RecruitmentDao recruitmentDao;
    @Override
    public void insertRecruitment(Recruitment recruitment) {
        recruitmentDao.insertRecruitment(recruitment);
    }

    @Override
    public void deleteRecruitmentById(Integer id) {
        recruitmentDao.deleteRecruitmentById(id);
    }

    @Override
    public List<Recruitment> queryAllrecruitment() {
        return recruitmentDao.queryAllrecruitment();
    }
}
