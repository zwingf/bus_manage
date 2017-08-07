package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.ICardTransactDao;
import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by wing on 2017/8/3.
 */
@Repository
public class CardTransactDao extends BaseDao<UserApplyRecordsEntity> implements ICardTransactDao {

    /**
     * 根据城市，时间，卡片类型，审批状态，操作类型（1申领2补办）的条件配置。
     */
    @Override
    public DetachedCriteria getDetachedCriteria(Object obj) {

        Map map = (Map) obj;
        if (map.isEmpty())
            return null;
        //        获取map中的查询参数
        Iterator iterator = map.entrySet().iterator();

        String cityCode = null;
        Long cardType = null;
        Long applyStatus = null;
        Long applyType = null;
        Date startDate = null;
        Date endDate = null;

        try {
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (entry.getKey().equals("cityCode"))
                    cityCode = (String) entry.getValue();
                else if (entry.getKey().equals("cardType"))
                    cardType = Long.valueOf((String) entry.getValue());
                else if (entry.getKey().equals("applyStatus"))
                    applyStatus = Long.valueOf((String) entry.getValue());
                else if (entry.getKey().equals("applyType"))
                    applyType = Long.valueOf((String) entry.getValue());
                else if (entry.getKey().equals("startDate"))
                    startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) entry.getValue());
                else if (entry.getKey().equals("endDate"))
                    endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) entry.getValue());
            }
        } catch (ParseException e) {
            System.out.println("传参有误，错误异常：" + e.getMessage());
        }

        DetachedCriteria dc = DetachedCriteria.forClass(UserApplyRecordsEntity.class);


        if (cityCode != null && cityCode.trim().length() > 0) {
            dc.add(Restrictions.like("cityCode", cityCode, MatchMode.ANYWHERE));
        }
        if (cardType != null) {
            dc.add(Restrictions.eq("cardType", cardType));
        }
        if (applyStatus != null) {
            dc.add(Restrictions.eq("applyStatus", applyStatus));
        }
        if (applyType != null) {
            dc.add(Restrictions.eq("applyType", applyType));
        }
        if (startDate != null && endDate != null) {
            dc.add(Restrictions.between("applyTime", startDate, endDate));
        }

        return dc;
    }


    public List<UserApplyRecordsEntity> getIdList(Map map) {

        if (map.isEmpty())
            return null;
        //        获取map中的查询参数
        Iterator iterator = map.entrySet().iterator();

        String cityCode = null;
        Long cardType = null;
        Long applyStatus = null;
        Long applyType = null;
        Date startDate = null;
        Date endDate = null;

        try {
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator.next();
                if (entry.getKey().equals("cityCode"))
                    cityCode = (String) entry.getValue();
                else if (entry.getKey().equals("cardType"))
                    cardType = Long.valueOf((String) entry.getValue());
                else if (entry.getKey().equals("applyStatus"))
                    applyStatus = Long.valueOf((String) entry.getValue());
                else if (entry.getKey().equals("applyType"))
                    applyType = Long.valueOf((String) entry.getValue());
                else if (entry.getKey().equals("startDate"))
                    startDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) entry.getValue());
                else if (entry.getKey().equals("endDate"))
                    endDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) entry.getValue());
            }
        } catch (ParseException e) {
            System.out.println("传参有误，错误异常：" + e.getMessage());
        }

        String alias = "entity_";   //查询的table别名
        DetachedCriteria dc = DetachedCriteria.forClass(UserApplyRecordsEntity.class, alias);
        ProjectionList pList = Projections.projectionList();
//        设置查询的指定结果字段
        pList.add(Projections.property(alias + "." + "applyId"));
        pList.add(Projections.property(alias + "." + "applyStatus"));
        dc.setProjection(pList);
        dc.setResultTransformer(Transformers.aliasToBean(UserApplyRecordsEntity.class));


//        添加条件
        if (cityCode != null && cityCode.trim().length() > 0) {
            dc.add(Restrictions.like("cityCode", cityCode, MatchMode.ANYWHERE));
        }
        if (cardType != null) {
            dc.add(Restrictions.eq("cardType", cardType));
        }
        if (applyStatus != null) {
            dc.add(Restrictions.eq("applyStatus", applyStatus));
        }
        if (applyType != null) {
            dc.add(Restrictions.eq("applyType", applyType));
        }
        if (startDate != null && endDate != null) {
            dc.add(Restrictions.between("applyTime", startDate, endDate));
        }

        List<UserApplyRecordsEntity> list = (List<UserApplyRecordsEntity>) getHibernateTemplate().findByCriteria(dc);
        return list;
    }
}
