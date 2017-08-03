package com.ics.bus_manage.biz;

import java.util.List;

/**
 * Created by wing on 2017/7/31.
 */
public interface IBaseService<T> {

    List<T> getList();

    List<T> getList(T t);

    List<T> getList(T t1,T t2, Object obj);

    void add(T t);

    void update(T t);

    void deleteById(Long id);

    T selectById(Long id);
}
