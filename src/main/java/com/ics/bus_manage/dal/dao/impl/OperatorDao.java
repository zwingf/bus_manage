package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IOperatorDao;
import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
@Repository
public class OperatorDao extends BaseDao<OperatorInfoEntity> implements IOperatorDao{

    @Override
    public OperatorInfoEntity selectByLoginnameAndPassword(String hql) {
        return (OperatorInfoEntity) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                Query query = session.createQuery(hql);
                return query.uniqueResult();
            }
        });
    }

    @Override
    public OperatorInfoEntity selectByCreatDate(String hql, Date date) {
        return (OperatorInfoEntity) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                Query query = session.createQuery(hql)
                        .setParameter(0,date);
                return query.uniqueResult();
            }
        });
    }
}
