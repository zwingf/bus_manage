package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 关联表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "MENU_ROLE_RELATION", schema = "SCOTT", catalog = "")
public class MenuRoleRelationEntity implements Serializable {
    private Long menuId;    //菜单id
    private Long roleId;    //角色id

    @Id
    @Column(name = "MENU_ID")
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Id
    @Column(name = "ROLE_ID")
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuRoleRelationEntity that = (MenuRoleRelationEntity) o;

        if (menuId != null ? !menuId.equals(that.menuId) : that.menuId != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = menuId != null ? menuId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        return result;
    }
}
