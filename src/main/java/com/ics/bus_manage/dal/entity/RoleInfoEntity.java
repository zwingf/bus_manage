package com.ics.bus_manage.dal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * 角色表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "ROLE_INFO", schema = "SCOTT", catalog = "")
public class RoleInfoEntity {
    private long roleId;		//角色id
    private String roleName;		//角色名字
    private long roleStatus;		//角色状态
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;		//创建日期
    private Long createOperatorId;		//操作员id

    @Id
    @Column(name = "ROLE_ID")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "ROLE_STATUS")
    public long getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(long roleStatus) {
        this.roleStatus = roleStatus;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "CREATE_OPERATOR_ID")
    public Long getCreateOperatorId() {
        return createOperatorId;
    }

    public void setCreateOperatorId(Long createOperatorId) {
        this.createOperatorId = createOperatorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleInfoEntity that = (RoleInfoEntity) o;

        if (roleId != that.roleId) return false;
        if (roleStatus != that.roleStatus) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createOperatorId != null ? !createOperatorId.equals(that.createOperatorId) : that.createOperatorId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (int) (roleStatus ^ (roleStatus >>> 32));
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createOperatorId != null ? createOperatorId.hashCode() : 0);
        return result;
    }
}
