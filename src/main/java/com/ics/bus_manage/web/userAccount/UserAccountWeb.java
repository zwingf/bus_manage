package com.ics.bus_manage.web.userAccount;

import com.ics.bus_manage.biz.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * Created by PC on 2017/8/3.
 */
@Controller
@RequestMapping("/userAccountWeb")
public class UserAccountWeb {

    @Autowired
    private IUserAccountService iUserAccountService;

    @RequestMapping("/selectFirstPageMassege")
    @ResponseBody
    public Map<String,Object> selectFirstPageMassege(Integer cityCode, Integer timeType, Date begin, Date end){
        return iUserAccountService.selectFirstPageMassege(cityCode, timeType, begin, end);
    };
}
