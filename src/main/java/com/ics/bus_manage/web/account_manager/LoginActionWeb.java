package com.ics.bus_manage.web.account_manager;

import com.ics.bus_manage.biz.ILoginService;
import com.ics.bus_manage.common.MD5Utils;
import com.ics.bus_manage.dal.entity.OperatorInfoEntity;
import com.ics.bus_manage.dal.entity.Result;
import com.ics.bus_manage.web.BaseWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by wangtianfeng on 2017/8/3.
 */
@Controller
@RequestMapping("/operatorLogin")
public class LoginActionWeb extends BaseWeb<OperatorInfoEntity> {

    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/login.do")
    @ResponseBody
    //登录验证
    public Result login(HttpServletRequest request, HttpSession session){
        String loginName = request.getParameter("loginName");
        String loginPassword = request.getParameter("loginPassword");
        //MD5加密
        loginPassword = MD5Utils.md5Password(loginPassword);
        Integer flag = iLoginService.selectByLoginnameAndPassword(loginName,loginPassword);
        Result result = new Result();
        result.setFlag(flag);
        return result;
    }
}
