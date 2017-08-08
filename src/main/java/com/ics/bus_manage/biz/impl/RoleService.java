package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.IRoleService;
import com.ics.bus_manage.dal.dao.IPowerDao;
import com.ics.bus_manage.dal.dao.IRoleDao;
import com.ics.bus_manage.dal.entity.MenuInfoEntity;
import com.ics.bus_manage.dal.entity.RoleInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
@Service
public class RoleService extends BaseService<RoleInfoEntity> implements IRoleService{
    @Autowired
    private IRoleDao iRoleDao;

    @Autowired
    private IPowerDao iPowerDao;

    @Override
    public void deleteAll(String ids) {
        // 将获取到的数据集进行处理
        String[] idss = ids.split(",");
        // 循环删除
        for (String id : idss) {
            iRoleDao.deleteById(Long.parseLong(id));
        }
    }
}
