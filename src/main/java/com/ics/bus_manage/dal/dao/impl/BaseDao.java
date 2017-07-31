package com.ics.bus_manage.dal.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by wing on 2017/7/30.
 */
public class BaseDao<T> extends HibernateDaoSupport{

    private Class<T> entityClass;

    public BaseDao(){
        Type type = getClass().getGenericSuperclass();
        ParameterizedType ptype=(ParameterizedType)type;
        Type[] types = ptype.getActualTypeArguments();
        entityClass=(Class<T>) types[0];
    }


    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public void add(T t){
        getHibernateTemplate().save(t);
    }

    public void update(T t){
        getHibernateTemplate().update(t);
    }

    public void deleteById(Long id) {
        getHibernateTemplate().delete(
                getHibernateTemplate().get(entityClass, id));
    }

    public T selectById(Long id){
        return getHibernateTemplate().get(entityClass, id);
    }
}
