package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.dal.dao.IBaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wing on 2017/7/31.
 */
public class BaseService<T> {

    @Autowired
    private IBaseDao<T> baseDao;

    public List<T> getList(Object obj) {
        return baseDao.getList(obj);
    }

    public List<T> getList(T t1,T t2, Object obj) {
        return baseDao.getList(t1,t2,obj);
    }

    public List<T> getList() {
        return baseDao.getList();
    }

    public void add(T t) {
        baseDao.add(t);
    }

    public void update(T t) {
        baseDao.update(t);
    }

    public void deleteById(Long id) {
        baseDao.deleteById(id);
    }

    public T selectById(Long id) {
        return baseDao.selectById(id);
    }
}
