package com.ics.bus_manage.biz;

import java.util.List;

/**
 * Created by wing on 2017/7/31.
 */
public interface IBaseService<T> {

    public List<T> getList(T t);

    void add(T t);

    void update(T t);

    void deleteById(Long id);

    T selectById(Long id);
}
