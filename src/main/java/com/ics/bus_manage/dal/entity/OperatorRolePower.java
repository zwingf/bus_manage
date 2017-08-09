package com.ics.bus_manage.dal.entity;

import java.util.Date;

/**
 * Created by wangtianfeng on 2017/8/8.
 */
public class OperatorRolePower {
    private long operatorId;		    //操作员id
    private String operatorName;		//名字
    private String operatortPwd;        //密码
    private Date createDate;            //创建日期
    private String cityCode;            //城市代码
    private long roleId;		        //角色id
    private String roleName;		    //角色名字
    private long roleStatus;            //角色状态
    private long menuId;		        //菜单id
    private String menuName;            //菜单名称
    private long menuStatus;            //菜单状态

    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatortPwd() {
        return operatortPwd;
    }

    public void setOperatortPwd(String operatortPwd) {
        this.operatortPwd = operatortPwd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public long getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(long roleStatus) {
        this.roleStatus = roleStatus;
    }

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public long getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(long menuStatus) {
        this.menuStatus = menuStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperatorRolePower that = (OperatorRolePower) o;

        if (operatorId != that.operatorId) return false;
        if (roleId != that.roleId) return false;
        if (roleStatus != that.roleStatus) return false;
        if (menuId != that.menuId) return false;
        if (menuStatus != that.menuStatus) return false;
        if (operatorName != null ? !operatorName.equals(that.operatorName) : that.operatorName != null) return false;
        if (operatortPwd != null ? !operatortPwd.equals(that.operatortPwd) : that.operatortPwd != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        return menuName != null ? menuName.equals(that.menuName) : that.menuName == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (operatorId ^ (operatorId >>> 32));
        result = 31 * result + (operatorName != null ? operatorName.hashCode() : 0);
        result = 31 * result + (operatortPwd != null ? operatortPwd.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (int) (roleStatus ^ (roleStatus >>> 32));
        result = 31 * result + (int) (menuId ^ (menuId >>> 32));
        result = 31 * result + (menuName != null ? menuName.hashCode() : 0);
        result = 31 * result + (int) (menuStatus ^ (menuStatus >>> 32));
        return result;
    }
}
