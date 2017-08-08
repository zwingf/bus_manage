package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IUserAccountDao;
import com.ics.bus_manage.dal.entity.UserAccountEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by PC on 2017/8/2.
 */
@Repository
public class UserAccountDao extends BaseDao<UserAccountEntity> implements IUserAccountDao{

    @Override
    public List<UserAccountEntity> selectAllRegisterUser(String hql) {
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                Query query = session.createQuery(hql);
                return query.list();
            }
        });
    }

    @Override
    public List<UserAccountEntity> selectRegisterUserByCityCode(String hql,String citycode,String phone) {
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                Query query = session.createQuery(hql)
                        .setParameter(0,citycode)
                        .setParameter(1,phone);
                return query.uniqueResult();
            }
        });
    }

    @Override
    public List<UserAccountEntity> selectCountByRegisterDate(String hql, Integer dateType) {
        return (List) getHibernateTemplate().execute(new HibernateCallback() {
            Query query;
            @Override
            public Object doInHibernate(final Session session) throws HibernateException {
                if(dateType == 0){
                    query = session.createNativeQuery(hql);
                }if(dateType == 1){
                    query = session.createQuery("select count(*) ,to_char(registerDate,'MM')"+hql);
                }if(dateType == 2){
                    query = session.createQuery("select count(*) ,to_char(registerDate,'yyyy')"+hql);
                }if(dateType == 3){
                    query = session.createQuery("select count(*)"+hql);
                }
                return  query.list();
            }
        });
    }
}
