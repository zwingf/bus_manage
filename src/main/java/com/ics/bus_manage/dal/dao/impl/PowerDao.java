package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IPowerDao;
import com.ics.bus_manage.dal.entity.MenuInfoEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
@Repository
public class PowerDao extends BaseDao<MenuInfoEntity> implements IPowerDao {
    @Override
    public Long getCount() {
        return null;
    }

    @Override
    public MenuInfoEntity selectByCreatDate(String hql, Date date) {
        return (MenuInfoEntity) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                Query query = session.createQuery(hql)
                        .setParameter(0,date);
                return query.uniqueResult();
            }
        });
    }
}
