package com.ics.bus_manage.dal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * 管理员信息表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "OPERATOR_INFO", schema = "SCOTT", catalog = "")
public class OperatorInfoEntity {
    private long operatorId;		//操作员id
    private String operatorName;		//名字
    private String operatortPwd;		//密码
    private String name;		//姓名
    private String phone;		//用户（手机号）
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;		//创建日期
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDate;		//修改日期
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLogin;		//最近一次登陆
    private String cityCode;		//城市代码

    @Id
    @Column(name = "OPERATOR_ID")
    public long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(long operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "OPERATOR_NAME")
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Basic
    @Column(name = "OPERATORT_PWD")
    public String getOperatortPwd() {
        return operatortPwd;
    }

    public void setOperatortPwd(String operatortPwd) {
        this.operatortPwd = operatortPwd;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Time createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "MODIFY_DATE")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Time modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "LAST_LOGIN")
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Time lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "CITY_CODE")
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperatorInfoEntity that = (OperatorInfoEntity) o;

        if (operatorId != that.operatorId) return false;
        if (operatorName != null ? !operatorName.equals(that.operatorName) : that.operatorName != null) return false;
        if (operatortPwd != null ? !operatortPwd.equals(that.operatortPwd) : that.operatortPwd != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (lastLogin != null ? !lastLogin.equals(that.lastLogin) : that.lastLogin != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (operatorId ^ (operatorId >>> 32));
        result = 31 * result + (operatorName != null ? operatorName.hashCode() : 0);
        result = 31 * result + (operatortPwd != null ? operatortPwd.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        return result;
    }
}
