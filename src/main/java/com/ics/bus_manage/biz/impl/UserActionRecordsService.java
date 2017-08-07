package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.IUserActionRecordsService;
import com.ics.bus_manage.dal.dao.IUserActionRecordsDao;
import com.ics.bus_manage.dal.entity.UserActionRecordsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by PC on 2017/8/2.
 */
@Service
public class UserActionRecordsService extends BaseService<UserActionRecordsEntity> implements IUserActionRecordsService  {
    @Autowired
    private IUserActionRecordsDao iUserActionRecordsDao;

    public UserActionRecordsService(IUserActionRecordsDao iUserActionRecordsDao) {
        this.iUserActionRecordsDao = iUserActionRecordsDao;
    }

    @Override
    public Map<String,Object> selectCountByTime(Integer cityCode, Integer timeType, Date begin, Date end  ) {
        Map<String,Object> map = new HashMap<String,Object>();
        for (int i = 1;i<=10;i++){
            StringBuffer sb = new StringBuffer(" from UserActionRecordsEntity ");
            //1: 卡片查询 2:NFC充值 3:360借条 4:手环充值 5:补登充值 6:理财产品 7:海淘商城 8:线路查询 9:社保代缴 10:微商城
            UserActionRecordsEntity userActionRecordsEntity = new UserActionRecordsEntity();
            sb.append(" where actionType="+i);

            if (timeType==0){
                sb.append("and to_char(actionTime,'dd')=to_char(sysdate,'dd')");
            }else if(timeType==1){
                sb.append("and to_char(actionTime,'iw')=to_char(sysdate,'iw')");
            }else if(timeType==2){
                sb.append("and to_char(actionTime,'dd')=to_char(sysdate,'dd')");
            }else if(timeType==3){
                sb.append("and to_char(actionTime,'yy')=to_char(sysdate,'yy')");
            }else if(timeType==5){
                sb.append("and actionTime between "+begin+" and "+end);
            }

            long count = iUserActionRecordsDao.selectCountByTime(sb.toString());
            map.put(""+i,count);
        }
        return map;
    }
}
