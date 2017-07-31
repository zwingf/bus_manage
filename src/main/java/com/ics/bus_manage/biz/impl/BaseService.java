package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.dal.dao.IBaseDao;
import com.ics.bus_manage.dal.entity.EmpEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wing on 2017/7/31.
 */
public class BaseService<T> {

    @Autowired
    private IBaseDao<T> baseDao;

    public List<T> getList(T t) {
        return baseDao.getList(t);
    }

    public void add(EmpEntity empEntity) {}

    public void update(EmpEntity empEntity) {}

    public void deleteById(Long id) {}

    public T selectById(Long id) {
        return baseDao.selectById(id);
    }
}
