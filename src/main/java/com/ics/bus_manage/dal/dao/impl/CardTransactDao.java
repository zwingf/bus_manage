package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.ICardTransactDao;
import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by wing on 2017/8/3.
 */
@Repository
public class CardTransactDao extends BaseDao<UserApplyRecordsEntity> implements ICardTransactDao {

    /**
     * 构建查询条件
     * @param
     * @return
     */
    public DetachedCriteria getDetachedCriteria(Map map){

        DetachedCriteria dc=DetachedCriteria.forClass(UserApplyRecordsEntity.class);

        return dc;
    }
}
