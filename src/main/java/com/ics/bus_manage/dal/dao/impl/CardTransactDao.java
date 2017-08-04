package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.ICardTransactDao;
import com.ics.bus_manage.dal.entity.EmpEntity;
import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;
import org.hibernate.criterion.*;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.*;

/**
 * Created by wing on 2017/8/3.
 */
@Repository
public class CardTransactDao extends BaseDao<UserApplyRecordsEntity> implements ICardTransactDao {

    /**
     * 根据地区，时间，卡片类型查询订单列表的条件配置。
     *
     * @param var 封装地区，时间跟卡片类型。
     *            时间：分为startDate，endDate,如果查一天endDate为null
     *            卡片类型,1,2,3,4,5对应五种类型
     *            订单ID
     * @return
     */
    @Override
    public DetachedCriteria getDetachedCriteria(Object var) {
        String cityCode = (String) var;
        DetachedCriteria dc = DetachedCriteria.forClass(UserApplyRecordsEntity.class);

        if (cityCode != null && cityCode.trim().length() > 0) {
            dc.add(Restrictions.like("cityCode", cityCode, MatchMode.ANYWHERE));
        }

        return dc;
    }

}
