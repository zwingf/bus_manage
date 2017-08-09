package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.RoleInfoEntity;

import java.util.Date;
import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
public interface IRoleDao extends IBaseDao<RoleInfoEntity> {

    List<RoleInfoEntity> RoleSelectByCondation(String hql, Date createDate, String roleName);
}
