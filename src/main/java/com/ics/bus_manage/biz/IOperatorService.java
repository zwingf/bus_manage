package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.OperatorInfoEntity;

import java.util.Date;
import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
public interface IOperatorService extends IBaseService<OperatorInfoEntity> {
    OperatorInfoEntity selectByCreateDate(Date date);

    void deleteAll(String ids);

    Integer selectByLoginnameAndPassword(String loginName,String loginPassword);
}
