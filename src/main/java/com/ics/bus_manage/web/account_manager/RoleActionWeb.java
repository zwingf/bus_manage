package com.ics.bus_manage.web.account_manager;

import com.ics.bus_manage.biz.IRolePowerService;
import com.ics.bus_manage.biz.IRoleService;
import com.ics.bus_manage.dal.entity.MenuRoleRelationEntity;
import com.ics.bus_manage.dal.entity.RoleInfoEntity;
import com.ics.bus_manage.web.BaseWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by wangtianfeng on 2017/8/4.
 */
@Controller
@RequestMapping("/RoleActionWeb")
public class RoleActionWeb extends BaseWeb<RoleInfoEntity> {

    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private IRolePowerService iRolePowerService;

    //角色添加
    @RequestMapping("/RoleAdd.do")
    public void RoleAdd(HttpServletRequest request){
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity();
        roleInfoEntity.setRoleName("业务办理");
        roleInfoEntity.setCreateDate(new Date());
        roleInfoEntity.setCreateOperatorId(1L);
        roleInfoEntity.setRoleStatus(1L);
        iRoleService.add(roleInfoEntity);
    }

    //批量获取要删除的数据的id
    private String ids;
    public String getIds() {
        return ids;
    }

    //角色批量删除
    @RequestMapping("/RoleDelete.do")
    public void RoleDelete(){
        iRoleService.deleteAll(ids);
    }

    //角色修改
    @RequestMapping("/RoleUpdate.do")
    public void RoleUpdate(Long roleId,Long menuId){
        //将要修改的这条数据通过id查询出来
        RoleInfoEntity roleInfoEntity = iRoleService.selectById(roleId);
        //对角色数据进行修改
        roleInfoEntity.setRoleStatus(0L);
        iRoleService.update(roleInfoEntity);
        //根据角色id将角色、权限的中间表查询出来
        MenuRoleRelationEntity menuRoleRelationEntity = iRolePowerService.selectById(roleId);
        //对关联关系进行修改
        menuRoleRelationEntity.setMenuId(menuId);
        iRolePowerService.update(menuRoleRelationEntity);
    }

    //角色查询
    @RequestMapping("/RoleSelect.do")
    @ResponseBody
    public List RoleSelect(){
        List<RoleInfoEntity> list = iRoleService.getList();
        return list;
    }

    //角色条件查询
    @RequestMapping("/RoleSelectByCondation.do")
    @ResponseBody
    public List RoleSelectByCondation(Date createDate,String roleName){
        List<RoleInfoEntity> list = iRoleService.RoleSelectByCondation(createDate,roleName);
        return list;
    }
}
