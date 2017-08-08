package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.IUserAccountService;
import com.ics.bus_manage.biz.IUserActionRecordsService;
import com.ics.bus_manage.dal.dao.IUserAccountDao;
import com.ics.bus_manage.dal.entity.UserAccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PC on 2017/8/2.
 */
@Service
public class UserAccountService extends BaseService<UserAccountEntity> implements IUserAccountService{

    @Autowired
    private IUserAccountDao iUserAccountDao;
    @Autowired
    private IUserActionRecordsService iUserActionRecordsService;

  public long selectCountByTime(Integer cityCode,Integer timeType, Date begin,Date end){
      //0表示今天 1表示本周 2表示本月 3表示今年 4表示全部 5表示自定义
      StringBuffer sb = new StringBuffer(" from UserAccountEntity ");
      if (timeType==0){
          sb.append("where to_char(registerDate,'dd')=to_char(sysdate,'dd')");
      }else if(timeType==1){
          sb.append("where to_char(registerDate,'iw')=to_char(sysdate,'iw')");
      }else if(timeType==2){
          sb.append("where to_char(registerDate,'dd')=to_char(sysdate,'dd')");
      }else if(timeType==3){
          sb.append("where to_char(registerDate,'yy')=to_char(sysdate,'yy')");
      }else if(timeType==5){
          sb.append("where registerDate between "+begin+" and "+end);
      }
      //sb.append(" and cityCode = "+ cityCode);
      return iUserAccountDao.selectCountByTime(sb.toString());
  }


    public Map<String, Object> selectFirstPageMassege(Integer cityCode, Integer timeType, Date begin, Date end) {

        Map<String,Object> fistPageMap = new HashMap<String,Object>();
        //newNum 新增用户数
        long newNum = this.selectCountByTime(cityCode,timeType, begin, end);
        fistPageMap.put("newNum",newNum);
        //resignNum 注册用户数
        long resignNum = this.selectCountByTime(cityCode,4, null, null);
        fistPageMap.put("resignNum",resignNum);
        //recordsList 操作记录数量集合
        Map<String, Object> map = iUserActionRecordsService.selectCountByTime(cityCode, timeType, begin, end);
        fistPageMap.put("map",map);
        return fistPageMap;
    }

    @Override
    public List<UserAccountEntity> selectAllRegisterUser() {
        StringBuffer sb = new StringBuffer();
        sb.append("from UserAccountEntity");
        String hql = sb.toString();
        return iUserAccountDao.selectAllRegisterUser(hql);
    }

    @Override
    public List<UserAccountEntity> selectRegisterUserByCityCode(String citycode,String phone) {
        StringBuffer sb = new StringBuffer();
        sb.append("from UserAccountEntity where cityCode = ? and phone = ?");
        String hql = sb.toString();
        return iUserAccountDao.selectRegisterUserByCityCode(hql,citycode,phone);
    }

    @Override
    public Object selectCountByRegisterDate(Integer selectType) {
        StringBuffer sb = new StringBuffer("from UserAccountEntity ");
        StringBuffer sbs = new StringBuffer("");
        Integer dateType = null;
        if (0 == selectType) {
            sbs.append("select count(*),to_char(APPLY_TIME,'yyyy-mm-dd') from (select * from USER_APPLY_RECORDS where APPLY_TIME > sysdate - (to_char(sysdate-1,'D'))) GROUP BY to_char(APPLY_TIME,'yyyy-mm-dd')");
            //create global temporary table USER_LS on commit delete rows as select * from USER_APPLY_RECORDS where APPLY_TIME > sysdate - (to_char(sysdate-1,'D'))
            //select count(*),to_char(APPLY_TIME,'yyyy-mm-dd') from (select * from USER_APPLY_RECORDS where APPLY_TIME > sysdate - (to_char(sysdate-1,'D'))) GROUP BY to_char(APPLY_TIME,'yyyy-mm-dd')
            dateType=0;
            String hql = sbs.toString();
            Object obj = iUserAccountDao.selectCountByRegisterDate(hql,dateType);
            return obj;
        }
        if (1 == selectType) {
            sb.append("group by to_char(registerDate,'MM')");
            dateType=1;
        }
        if (2 == selectType) {
            sb.append("group by to_char(registerDate,'yyyy')");
            dateType=2;
        }
        if (3 == selectType) {
            sb.append("");
            dateType=3;
        }
        String hql = sb.toString();
        Object obj = iUserAccountDao.selectCountByRegisterDate(hql,dateType);
        return obj;
    }
}
