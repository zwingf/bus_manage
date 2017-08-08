package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.IPowerService;
import com.ics.bus_manage.dal.dao.IPowerDao;
import com.ics.bus_manage.dal.entity.MenuInfoEntity;
import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
@Service
public class PowerService extends BaseService<MenuInfoEntity> implements IPowerService{

    @Autowired
    private IPowerDao iPowerDao;

    @Override
    public void deleteAll(String ids) {
        // 将获取到的数据集进行处理
        String[] idss = ids.split(",");
        // 循环删除
        for (String id : idss) {
            iPowerDao.deleteById(Long.parseLong(id));
        }
    }

    @Override
    public MenuInfoEntity selectByCreatDate(Date date) {
        StringBuffer sb = new StringBuffer();
        sb.append("from MenuInfoEntity where createDate = ?");
        String hql = sb.toString();
        return iPowerDao.selectByCreatDate(hql,date);
    }
}
