package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.RoleInfoEntity;

import java.util.Date;
import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
public interface IRoleService extends IBaseService <RoleInfoEntity>{
    void deleteAll(String ids);

    List<RoleInfoEntity>  RoleSelectByCondation(Date createDate, String roleName);
}
