package com.ics.bus_manage.web;

import com.ics.bus_manage.dal.entity.UserActionRecordsEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PC on 2017/8/2.
 */
@Controller
@RequestMapping("/userActionRecordsWeb")
public class UserActionRecordsWeb extends BaseWeb<UserActionRecordsEntity>{
}
