package com.ics.bus_manage.biz;

import com.ics.bus_manage.dal.entity.UserAccountEntity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by PC on 2017/8/2.
 */
public interface IUserAccountService extends IBaseService<UserAccountEntity>{

    long selectCountByTime(Integer cityCode, Integer timeType, Date begin, Date end);

    Map<String,Object> selectFirstPageMassege(Integer cityCode, Integer timeType, Date begin, Date end);

    List<UserAccountEntity> selectAllRegisterUser();

    List<UserAccountEntity> selectRegisterUserByCityCode(String citycode,String phone);

    Object selectCountByRegisterDate(Integer registerDate);
}
