package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by wing on 2017/8/3.
 */
public interface ICardTransactDao extends IBaseDao<UserApplyRecordsEntity>{

    /**
     * 通过传入城市，时间，卡片类型查询所有的订单ID跟审批状态的封装实体类列表
     * @param map
     * @return
     */
    List getIdList(Map map);
}
