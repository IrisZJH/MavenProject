package com.zjh.ssmpro.dao;

import com.zjh.ssmpro.entity.Invitation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 18221 on 2018/10/13.
 */
@Repository
public interface InvitationDao {
    public void insertInvitation(Invitation invitation);
    public List<Invitation> queryInvitationByName(String name);
    public List<Invitation> queryInvitationByType(int type);
    public void updateInvitationByName(String name);
}
