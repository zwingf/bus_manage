package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.RechargeEntity;

import java.util.List;

/**
 * Created by yangguang on 2017/8/2.
 */
public interface IRechargeDao extends IBaseDao<RechargeEntity> {
    List<RechargeEntity> query(Long id);
}
