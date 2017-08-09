package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IRoleDao;
import com.ics.bus_manage.dal.entity.RoleInfoEntity;
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
public class RoleDao extends BaseDao<RoleInfoEntity> implements IRoleDao {
    @Override
    public List<RoleInfoEntity> RoleSelectByCondation(String hql, Date createDate, String roleName) {
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                Query query = session.createQuery(hql)
                        .setParameter(0,roleName)
                        .setParameter(1,createDate);
                return query.list();
            }
        });
    }
}
