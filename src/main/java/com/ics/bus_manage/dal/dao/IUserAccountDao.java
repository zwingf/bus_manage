package com.ics.bus_manage.dal.dao;

import com.ics.bus_manage.dal.entity.UserAccountEntity;

import java.util.Date;
import java.util.List;

/**
 * Created by 王泽溥 on 2017/8/2.
 */
public interface IUserAccountDao extends IBaseDao<UserAccountEntity>{
    long selectCountByTime(String hql);

    List<UserAccountEntity> selectAllRegisterUser(String hql);

    List<UserAccountEntity> selectRegisterUserByCityCode(String hql,String citycode,String phone);

    List<UserAccountEntity> selectCountByRegisterDate(String hql,Integer dateType);
}
