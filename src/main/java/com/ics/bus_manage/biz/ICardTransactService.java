package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;

import java.util.List;
import java.util.Map;


/**
 * Created by wing on 2017/8/3.
 */
public interface ICardTransactService extends IBaseService<UserApplyRecordsEntity> {

    List<UserApplyRecordsEntity> getIdList(Map map);
}
