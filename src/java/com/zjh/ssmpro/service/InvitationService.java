package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Resums;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
public interface InvitationService {
    public void addInvitation(Invitation invitation);
    public List<Invitation> queryInvitationByName(String name);
    public void updateInvitationById(Invitation invitation);
    public List<Invitation> queryInvitationByType(int type);
    public List<Invitation> queryInvitationByVid(int vid);
    public Invitation queryInvitationById(Integer id);
}
