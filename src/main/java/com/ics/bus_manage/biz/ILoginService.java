package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.OperatorInfoEntity;

/**
 * Created by wangtianfeng on 2017/8/3.
 */
public interface ILoginService extends IBaseService<OperatorInfoEntity>{

    Integer selectByLoginnameAndPassword(String loginName,String loginPassword);

}
