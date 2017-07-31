package com.ics.bus_manage.dal.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

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

    /**]
     *
     * 自调用函数，不用理会。
     * @param t
     * @return
     */
    public DetachedCriteria getDetachedCriteria(T t){
        return null;
    }

    /**
     * 条件查询列表
     * @param t
     * @return
     */
    public List<T> getList(T t){

        DetachedCriteria dc = getDetachedCriteria(t);
        return (List<T>) getHibernateTemplate().findByCriteria(dc);
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
