package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import org.apache.poi.hssf.record.formula.functions.T;

/**
 * Created by wangtianfeng on 2017/8/3.
 */
public interface ILoginDao extends IBaseDao<OperatorInfoEntity>{

    OperatorInfoEntity  selectByLoginnameAndPassword(String hql);
}
