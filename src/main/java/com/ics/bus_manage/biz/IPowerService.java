package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.MenuInfoEntity;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
public interface IPowerService extends IBaseService<MenuInfoEntity> {
    void deleteAll(String ids);

    MenuInfoEntity selectByCreatDate(Date date);
}
