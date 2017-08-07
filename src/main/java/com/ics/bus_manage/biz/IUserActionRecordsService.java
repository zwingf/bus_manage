package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.UserActionRecordsEntity;

import java.util.Date;
import java.util.Map;

/**
 * Created by PC on 2017/8/2.
 */
public interface IUserActionRecordsService extends IBaseService<UserActionRecordsEntity>{

    Map<String,Object> selectCountByTime(Integer cityCode, Integer timeType, Date begin, Date end);
}
