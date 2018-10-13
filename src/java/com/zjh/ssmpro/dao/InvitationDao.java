package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Invitation;
import org.springframework.stereotype.Repository;

/**
 * Created by 18221 on 2018/10/13.
 */
@Repository
public interface InvitationDao {
    public void insertInvitation(Invitation invitation);
    public  Invitation queryInvitationByName(String name);
}
