package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.RoleInfoEntity;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
public interface IRoleService extends IBaseService <RoleInfoEntity>{
    void deleteAll(String ids);
}
