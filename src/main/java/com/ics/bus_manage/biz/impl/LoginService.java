package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.ILoginService;
import com.ics.bus_manage.dal.dao.ILoginDao;
import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangtianfeng on 2017/8/3.
 */
@Service
public class LoginService extends BaseService<OperatorInfoEntity> implements ILoginService {

    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public Integer selectByLoginnameAndPassword(String loginName, String loginPassword) {
        String hql = "select * from OperatorInfoEntity where operatorName =" + loginName + "and operatortPwd =" + loginPassword;
        OperatorInfoEntity operatorInfoEntity = iLoginDao.selectByLoginnameAndPassword(hql);
        if (operatorInfoEntity!=null) {
            return 1;
        }
        return 0;
    }
}
