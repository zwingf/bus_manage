package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IRechargeDao;
import com.ics.bus_manage.dal.entity.RechargeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yangguang on 2017/8/2.
 */
@Repository
public class RechargeDao extends BaseDao<RechargeEntity> implements IRechargeDao {
    @Override
    public List<RechargeEntity> query(Long id) {

        return null;
    }
}
