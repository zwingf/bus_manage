package com.ics.bus_manage.web;

import com.ics.bus_manage.dal.entity.EmpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wing on 2017/7/28.
 */
@Controller
@RequestMapping("/demo")
public class DemoWeb extends BaseWeb<EmpEntity>{

}
