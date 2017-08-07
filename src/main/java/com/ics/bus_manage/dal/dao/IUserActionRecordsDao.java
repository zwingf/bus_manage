package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.UserActionRecordsEntity;

import java.util.List;

/**
 * Created by 王泽溥 on 2017/8/2.
 */
public interface IUserActionRecordsDao extends IBaseDao<UserActionRecordsEntity>{
    long selectCountByTime(String hql);
}
