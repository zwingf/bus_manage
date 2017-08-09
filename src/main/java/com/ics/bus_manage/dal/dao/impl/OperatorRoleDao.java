package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IOperatorDao;
import com.ics.bus_manage.dal.dao.IOperatorRoleDao;
import com.ics.bus_manage.dal.entity.OperatorRoleRelationEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
@Repository
public class OperatorRoleDao extends BaseDao<OperatorRoleRelationEntity> implements IOperatorRoleDao {
}
