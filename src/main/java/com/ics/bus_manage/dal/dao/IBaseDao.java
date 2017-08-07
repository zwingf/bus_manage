package com.ics.bus_manage.dal.dao;


import java.util.List;

/**
 * Created by wing on 2017/7/30.
 */
public interface IBaseDao<T> {

    List<T> getList();

    List<T> getList(T t1, T t2, Object obj);

    /**
     *通过自定义查询参数获取所有封装实体类列表
     * @param obj 例如可以传入一个Object参数，然后dao重写getDetachedCriteria()方法实现参数解析
     * @return
     */
    List<T> getList(Object obj);

    void add(T t);

    void update(T t);

    void deleteById(Long id);

    T selectById(Long id);

    long selectCountByTime(final String hql);
}
