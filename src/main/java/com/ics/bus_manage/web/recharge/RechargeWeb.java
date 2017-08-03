package com.ics.bus_manage.web.recharge;

import com.ics.bus_manage.dal.entity.RechargeEntity;
import com.ics.bus_manage.web.BaseWeb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yangguang on 2017/8/3.
 */
@Controller
@RequestMapping("/recharge")
public class RechargeWeb extends BaseWeb<RechargeEntity> {
}
