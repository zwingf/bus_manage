package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.MenuInfoEntity;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
public interface IPowerDao extends IBaseDao<MenuInfoEntity> {

    MenuInfoEntity selectByCreatDate( String hql,Date date);
}
