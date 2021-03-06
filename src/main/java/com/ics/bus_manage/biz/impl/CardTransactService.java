package com.ics.bus_manage.biz.impl;

import com.ics.bus_manage.biz.ICardTransactService;
import com.ics.bus_manage.dal.dao.ICardTransactDao;
import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * 卡片办理Service
 * Created by wing on 2017/8/3.
 */
@Service
public class CardTransactService extends BaseService<UserApplyRecordsEntity> implements ICardTransactService {

    @Autowired
    private ICardTransactDao dao;

    @Override
    public List<UserApplyRecordsEntity> getIdList(Map map){

        return dao.getIdList(map) ;
    }
}
