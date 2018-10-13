package com.zjh.ssmpro.service.impl;

import com.zjh.ssmpro.dao.InvitationDao;
import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 18221 on 2018/10/13.
 */
@Service("invitationService")
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationDao invitationDao;

    @Override
    public void addInvitation(Invitation invitation) {
        invitationDao.insertInvitation(invitation);
    }

    @Override
    public Invitation queryInvitationByName(String name) {
        return invitationDao.queryInvitationByName(name);
    }


}
