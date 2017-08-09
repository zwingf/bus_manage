package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.OperatorInfoEntity;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
public interface IOperatorDao extends IBaseDao<OperatorInfoEntity> {
    OperatorInfoEntity selectByCreatDate(String hql,Date date);

    OperatorInfoEntity  selectByLoginnameAndPassword(String hql);
}
