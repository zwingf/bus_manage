package com.ics.bus_manage.web.cardTransact;

import com.ics.bus_manage.biz.ICardTransactService;
import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;
import com.ics.bus_manage.web.BaseWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by wing on 2017/8/3.
 */
@Controller
@RequestMapping("/cardTransact")
public class CardTransactWeb extends BaseWeb<UserApplyRecordsEntity>{

    @Autowired
    private ICardTransactService service;

    /**
     *
     * @return
     */
    @RequestMapping("/getIdList")
    @ResponseBody
    public List<UserApplyRecordsEntity> getIdList(@RequestBody Map map){

        return service.getIdList(map);
    }
}
