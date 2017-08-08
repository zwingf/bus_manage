package com.ics.bus_manage.web.account_manager;

import com.ics.bus_manage.biz.IPowerService;
import com.ics.bus_manage.dal.entity.MenuInfoEntity;
import com.ics.bus_manage.dal.entity.MenuRoleRelationEntity;
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
@RequestMapping("/PowerActionWeb")
public class PowerActionWeb extends BaseWeb<MenuInfoEntity> {

    @Autowired
    private IPowerService iPowerService;

    //权限添加
    @RequestMapping("/PowerAdd.do")
    public void PowerAdd(HttpServletRequest request){
        //获取角色id
        Long roleId = Long.parseLong(request.getParameter("roleId"));
        //获取权限数据
        MenuInfoEntity menuInfoEntity = new MenuInfoEntity();
        //获取创建日期
        Date date = new Date();
        menuInfoEntity.setCreateDate(date);
        //添加权限数据
        iPowerService.add(menuInfoEntity);
        //将新添加的权限的id查询出来，关联角色
        Long menuId = iPowerService.selectByCreatDate(date).getMenuId();
        //将角色id和权限id插入中间表
        MenuRoleRelationEntity menuRoleRelationEntity = new MenuRoleRelationEntity();
        menuRoleRelationEntity.setMenuId(menuId);
        menuRoleRelationEntity.setRoleId(roleId);
    }

    //批量获取要删除的数据的id
    private String ids;
    public String getIds() {
        return ids;
    }

    //权限批量删除
    @RequestMapping("/PowerDelete.do")
    public void PowerDelete(){
        iPowerService.deleteAll(ids);
    }

    //权限修改
    @RequestMapping("/PowerUpdate.do")
    public void PowerUpdate(Long id){
        MenuInfoEntity menuInfoEntity = iPowerService.selectById(id);
        iPowerService.update(menuInfoEntity);
    }

    //权限查询
    @RequestMapping("/PowerSelect.do")
    @ResponseBody
    public List<MenuInfoEntity> PowerSelect(){
        List<MenuInfoEntity> list = iPowerService.getList();
        return list;
    }
}
