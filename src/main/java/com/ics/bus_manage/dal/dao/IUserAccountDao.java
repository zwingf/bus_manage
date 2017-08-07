package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.UserAccountEntity;

import java.util.Date;

/**
 * Created by 王泽溥 on 2017/8/2.
 */
public interface IUserAccountDao extends IBaseDao<UserAccountEntity>{
    long selectCountByTime(String hql);
}
