package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Recruitment;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
public interface RecruitmentService {
    public void insertRecruitment(Recruitment recruitment);
    public void deleteRecruitmentById(Integer id);
    public List<Recruitment> queryAllrecruitment();
}
