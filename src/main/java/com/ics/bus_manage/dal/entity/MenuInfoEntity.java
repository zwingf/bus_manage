package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 菜单表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "MENU_INFO", schema = "SCOTT", catalog = "")
public class MenuInfoEntity {
    private long menuId;		//菜单id
    private String menuName;		//菜单名称
    private String url;		//url
    private long menuStatus;		//菜单状态
    private Long menuOrder;		//排序
    private Long createOperatorId;		//操作员id
    private Time createDate;		//创建日期
    private Long menuLevel;		//菜单等级
    private Long parentMenuId;		//父菜单id
    private String menuDesc;		//菜单描述
    private Long menuType;		//菜单类型

    @Id
    @Column(name = "MENU_ID")
    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "MENU_NAME")
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "MENU_STATUS")
    public long getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(long menuStatus) {
        this.menuStatus = menuStatus;
    }

    @Basic
    @Column(name = "MENU_ORDER")
    public Long getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Long menuOrder) {
        this.menuOrder = menuOrder;
    }

    @Basic
    @Column(name = "CREATE_OPERATOR_ID")
    public Long getCreateOperatorId() {
        return createOperatorId;
    }

    public void setCreateOperatorId(Long createOperatorId) {
        this.createOperatorId = createOperatorId;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public Time getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Time createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "MENU_LEVEL")
    public Long getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Long menuLevel) {
        this.menuLevel = menuLevel;
    }

    @Basic
    @Column(name = "PARENT_MENU_ID")
    public Long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    @Basic
    @Column(name = "MENU_DESC")
    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    @Basic
    @Column(name = "MENU_TYPE")
    public Long getMenuType() {
        return menuType;
    }

    public void setMenuType(Long menuType) {
        this.menuType = menuType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuInfoEntity that = (MenuInfoEntity) o;

        if (menuId != that.menuId) return false;
        if (menuStatus != that.menuStatus) return false;
        if (menuName != null ? !menuName.equals(that.menuName) : that.menuName != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (menuOrder != null ? !menuOrder.equals(that.menuOrder) : that.menuOrder != null) return false;
        if (createOperatorId != null ? !createOperatorId.equals(that.createOperatorId) : that.createOperatorId != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (menuLevel != null ? !menuLevel.equals(that.menuLevel) : that.menuLevel != null) return false;
        if (parentMenuId != null ? !parentMenuId.equals(that.parentMenuId) : that.parentMenuId != null) return false;
        if (menuDesc != null ? !menuDesc.equals(that.menuDesc) : that.menuDesc != null) return false;
        if (menuType != null ? !menuType.equals(that.menuType) : that.menuType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (menuId ^ (menuId >>> 32));
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (int) (menuStatus ^ (menuStatus >>> 32));
        result = 31 * result + (menuOrder != null ? menuOrder.hashCode() : 0);
        result = 31 * result + (createOperatorId != null ? createOperatorId.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (menuLevel != null ? menuLevel.hashCode() : 0);
        result = 31 * result + (parentMenuId != null ? parentMenuId.hashCode() : 0);
        result = 31 * result + (menuDesc != null ? menuDesc.hashCode() : 0);
        result = 31 * result + (menuType != null ? menuType.hashCode() : 0);
        return result;
    }
}
