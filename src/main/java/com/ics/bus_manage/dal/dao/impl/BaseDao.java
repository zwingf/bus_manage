package com.ics.bus_manage.dal.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateCallback;
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
     * 自调用函数，设置条件查询子类重写该方法即可。
     * @param
     * @return
     */
    public DetachedCriteria getDetachedCriteria(T t1,T t2,Object obj){
        return null;
    }
    public DetachedCriteria getDetachedCriteria(Object obj){
        return null;
    }

    /**
     * 条件查询列表
     * @param
     * @return
     */
    public List<T> getList(){
        return getHibernateTemplate().loadAll(entityClass);
    }
    public List<T> getList(T t1,T t2,Object obj){
        DetachedCriteria dc = getDetachedCriteria(t1,t2,obj);
            return (List<T>) getHibernateTemplate().findByCriteria(dc);
    }
    public List<T> getList(Object obj){
        DetachedCriteria dc = getDetachedCriteria(obj);
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

    //返回条数的方法
    public long selectCountByTime(final String hql) {
        Long totalRow = (Long)getHibernateTemplate().execute(new HibernateCallback(){
            public Object doInHibernate(Session session)
                    throws HibernateException {
                Long count = (Long)session.createQuery("select count(1) " + hql).uniqueResult();
                return count;
            }
        });
        return totalRow;
    }
}
