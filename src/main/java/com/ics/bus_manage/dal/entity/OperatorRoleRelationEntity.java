package com.ics.bus_manage.dal.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 关联表
 * Created by wing on 2017/8/1.
 */
//@Entity
@Table(name = "OPERATOR_ROLE_RELATION", schema = "SCOTT", catalog = "")
public class OperatorRoleRelationEntity {
    private Long operatorId;    //操作员id
    private Long roleId;        //角色id

    @Basic
    @Column(name = "OPERATOR_ID")
    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
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

        OperatorRoleRelationEntity that = (OperatorRoleRelationEntity) o;

        if (operatorId != null ? !operatorId.equals(that.operatorId) : that.operatorId != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operatorId != null ? operatorId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        return result;
    }
}
