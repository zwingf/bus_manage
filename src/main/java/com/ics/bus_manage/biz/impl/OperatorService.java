package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.IOperatorService;
import com.ics.bus_manage.dal.dao.IOperatorDao;
import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
@Service
public class OperatorService extends BaseService<OperatorInfoEntity> implements IOperatorService{

    @Autowired
    private IOperatorDao iOperatorDao;

    @Override
    public Integer selectByLoginnameAndPassword(String loginName, String loginPassword) {
        String hql = "select * from OperatorInfoEntity where operatorName =" + loginName + "and operatortPwd =" + loginPassword;
        OperatorInfoEntity operatorInfoEntity = iOperatorDao.selectByLoginnameAndPassword(hql);
        if (operatorInfoEntity!=null) {
            return 1;
        }
        return 0;
    }

    @Override
    public OperatorInfoEntity selectByCreateDate(Date date) {
        StringBuffer sb = new StringBuffer();
        sb.append("from OperatorInfoEntity where createDate = ?");
        String hql = sb.toString();
        return iOperatorDao.selectByCreatDate(hql,date);
    }

    @Override
    public void deleteAll(String ids) {
        // 将获取到的数据集进行处理
        String[] idss = ids.split(",");
        // 循环删除
        for (String id : idss) {
            iOperatorDao.deleteById(Long.parseLong(id));
        }
    }
}
