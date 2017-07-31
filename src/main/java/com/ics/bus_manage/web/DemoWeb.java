package com.ics.bus_manage.web;

import com.ics.bus_manage.biz.IEmpService;
import com.ics.bus_manage.dal.dao.IEmpDao;
import com.ics.bus_manage.dal.entity.EmpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wing on 2017/7/28.
 */
@Controller
@RequestMapping("/demo")
public class DemoWeb {

   @Autowired
    private IEmpService empService;
   @Autowired
   private IEmpDao empDao;

    @RequestMapping("/daoView")
    @ResponseBody
    public void daoView(HttpServletResponse response) throws IOException {
//        EmpEntity empEntity = empService.selectById(7369l);
        EmpEntity empEntity = empDao.selectById(7369L);
        System.out.println(empEntity);
        response.getWriter().print(empEntity);
    }

    @RequestMapping("/serviceView")
    @ResponseBody
    public void serviceView(HttpServletResponse response) throws IOException {
        EmpEntity empEntity = empService.selectById(7369l);
        System.out.println(empEntity);
        response.getWriter().print(empEntity);
    }
}
