package com.ics.bus_manage.web.account_manager;

import com.ics.bus_manage.biz.*;
import com.ics.bus_manage.common.MD5Utils;
import com.ics.bus_manage.dal.entity.*;
import com.ics.bus_manage.web.BaseWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
@Controller
@RequestMapping("/OperatorActionWeb")
public class OperatorActionWeb extends BaseWeb<OperatorInfoEntity>{

    @Autowired
    private IOperatorService iOperatorService;
    @Autowired
    private IOperatorRoleService iOperatorRoleService;
    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private IRolePowerService iRolePowerService;
    @Autowired
    private IPowerService iPowerService;

    //登录验证
    @RequestMapping("/login.do")
    @ResponseBody
    public Result login(HttpServletRequest request, HttpSession session){
        String loginName = request.getParameter("loginName");
        String loginPassword = request.getParameter("loginPassword");
        //MD5加密
        loginPassword = MD5Utils.md5Password(loginPassword);
        Integer flag = iOperatorService.selectByLoginnameAndPassword(loginName,loginPassword);
        Result result = new Result();
        result.setFlag(flag);
        return result;
    }

    //管理员添加
    @RequestMapping("/OperatorAdd.do")
    public void OperatorAdd(Long roleId){
        OperatorInfoEntity operatorInfoEntity =  new OperatorInfoEntity();
        Date date = new Date();
        operatorInfoEntity.setCreateDate(date);
        //添加管理人员
        iOperatorService.add(operatorInfoEntity);
        //根据创建日期将添加的管理人员的id查询出来
        Long operatorId = iOperatorService.selectByCreateDate(date).getOperatorId();
        OperatorRoleRelationEntity operatorRoleRelationEntity = new OperatorRoleRelationEntity();
        operatorRoleRelationEntity.setRoleId(roleId);
        operatorRoleRelationEntity.setOperatorId(operatorId);
        //将关联关系插入到数据库
        iOperatorRoleService.add(operatorRoleRelationEntity);
    }

    //批量获取要删除的数据的id
    private String ids;
    public String getIds() {
        return ids;
    }

    //管理账户批量删除
    @RequestMapping("/OperatorDelete.do")
    public void OperatorDelete(){
        iOperatorService.deleteAll(ids);
    }

    //管理人员修改
    @RequestMapping("/OperatorUpdate.do")
    public void OperatorUpdate(Long operatorId,Long roleId){
        //根据管理员数据的id将该条数据查询出来
        OperatorInfoEntity operatorInfoEntity = iOperatorService.selectById(operatorId);
        //首先对管理员字段数据进行修改
        operatorInfoEntity.setPhone("111111111111");
        iOperatorService.update(operatorInfoEntity);
        //通过管理员id查询出和角色关联的表
        OperatorRoleRelationEntity operatorRoleRelationEntity = iOperatorRoleService.selectById(operatorId);
        //对管理员和角色的关联进行修改
        operatorRoleRelationEntity.setRoleId(roleId);
        iOperatorRoleService.update(operatorRoleRelationEntity);
    }

    //管理账户查询
    @RequestMapping("/OperatorSelect.do")
    @ResponseBody
    public List<OperatorRolePower> OperatorSelect(){
        ArrayList<OperatorRolePower> arrayList = new ArrayList<OperatorRolePower>();
        //查询管理员
        List<OperatorInfoEntity> list = iOperatorService.getList();
        for (OperatorInfoEntity operatorInfoEntity:list) {
            //获取管理员id
            Long operatorId = operatorInfoEntity.getOperatorId();
            //通过管理员id查询出角色id
            OperatorRoleRelationEntity operatorRoleRelationEntity = iOperatorRoleService.selectById(operatorId);
            Long roleId = operatorRoleRelationEntity.getRoleId();
            //通过角色id查询出角色数据
            RoleInfoEntity roleInfoEntity = iRoleService.selectById(roleId);
            //通过角色id查询出权限id
            MenuRoleRelationEntity menuRoleRelationEntity = iRolePowerService.selectById(roleId);
            Long menuId = menuRoleRelationEntity.getMenuId();
            //通过权限id查询出权限数据
            MenuInfoEntity menuInfoEntity = iPowerService.selectById(menuId);
            //将管理员、角色、权限前台需要的数据进行自定义封装
            OperatorRolePower operatorRolePower = new OperatorRolePower();
            operatorRolePower.setCreateDate(operatorInfoEntity.getCreateDate());
            operatorRolePower.setCityCode(operatorInfoEntity.getCityCode());
            operatorRolePower.setOperatorId(operatorId);
            operatorRolePower.setOperatorName(operatorInfoEntity.getOperatorName());
            operatorRolePower.setOperatortPwd(operatorInfoEntity.getOperatortPwd());
            operatorRolePower.setRoleId(roleId);
            operatorRolePower.setRoleName(roleInfoEntity.getRoleName());
            operatorRolePower.setRoleStatus(roleInfoEntity.getRoleStatus());
            operatorRolePower.setMenuId(menuId);
            operatorRolePower.setMenuName(menuInfoEntity.getMenuName());
            operatorRolePower.setMenuStatus(menuInfoEntity.getMenuStatus());
            arrayList.add(operatorRolePower);
        }
        return arrayList;
    }
}