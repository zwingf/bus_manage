package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IEmpDao;
import com.ics.bus_manage.dal.dao.ILoginDao;
import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/3.
 */
@Repository
public class LoginDao extends BaseDao<OperatorInfoEntity> implements ILoginDao {

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
}
