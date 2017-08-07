package com.ics.bus_manage.dal.dao;


import java.util.List;

/**
 * Created by wing on 2017/7/30.
 */
public interface IBaseDao<T> {

    List<T> getList();

    List<T> getList(T t1, T t2, Object obj);

    List<T> getList(Object obj);

    void add(T t);

    void update(T t);

    void deleteById(Long id);

    T selectById(Long id);

    long selectCountByTime(final String hql);
}
