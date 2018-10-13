package com.zjh.ssmpro.service;

import com.zjh.ssmpro.entity.Invitation;
import com.zjh.ssmpro.entity.Resums;

/**
 * Created by 18221 on 2018/10/13.
 */
public interface InvitationService {
    public void addInvitation(Invitation invitation);
    public  Invitation queryInvitationByName(String name);
}
