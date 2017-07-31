package com.ics.bus_manage.dal.dao;

/**
 * Created by wing on 2017/7/30.
 */
public interface IBaseDao<T> {

    void add(T t);

    void update(T t);

    void deleteById(Long id);

    T selectById(Long id);
}
