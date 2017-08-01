package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 用户信息
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "USER_ACCOUNT", schema = "SCOTT", catalog = "")
public class UserAccountEntity {
    private long userId;		//用户id
    private String userName;		//
    private String userPwd;		//
    private String name;		//姓名
    private String userIdentity;		//身份证号
    private String userAddress;		//住址
    private String phone;		//用户（手机号）
    private String cityCode;		//城市代码
    private Long userStatus;		//
    private Long clsOperId;		//
    private Time clsDate;		//
    private Time registerDate;		//
    private String note;		//
    private String userPayPwd;		//交易密码
    private String isManager;		//是否管理人员
    private Long userPwdErrNum;		//登录密码错误次数
    private Long userPayPwdErrNum;		//交易密码错误次数
    private Time userLockTime;		//登录密码锁定时间
    private Time userPayLockTime;		//交易密码锁定时间

    @Id
    @Column(name = "USER_ID")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "USER_PWD")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
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
    @Column(name = "USER_IDENTITY")
    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Basic
    @Column(name = "USER_ADDRESS")
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
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
    @Column(name = "CITY_CODE")
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "USER_STATUS")
    public Long getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Long userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "CLS_OPER_ID")
    public Long getClsOperId() {
        return clsOperId;
    }

    public void setClsOperId(Long clsOperId) {
        this.clsOperId = clsOperId;
    }

    @Basic
    @Column(name = "CLS_DATE")
    public Time getClsDate() {
        return clsDate;
    }

    public void setClsDate(Time clsDate) {
        this.clsDate = clsDate;
    }

    @Basic
    @Column(name = "REGISTER_DATE")
    public Time getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Time registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "USER_PAY_PWD")
    public String getUserPayPwd() {
        return userPayPwd;
    }

    public void setUserPayPwd(String userPayPwd) {
        this.userPayPwd = userPayPwd;
    }

    @Basic
    @Column(name = "IS_MANAGER")
    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    @Basic
    @Column(name = "USER_PWD_ERR_NUM")
    public Long getUserPwdErrNum() {
        return userPwdErrNum;
    }

    public void setUserPwdErrNum(Long userPwdErrNum) {
        this.userPwdErrNum = userPwdErrNum;
    }

    @Basic
    @Column(name = "USER_PAY_PWD_ERR_NUM")
    public Long getUserPayPwdErrNum() {
        return userPayPwdErrNum;
    }

    public void setUserPayPwdErrNum(Long userPayPwdErrNum) {
        this.userPayPwdErrNum = userPayPwdErrNum;
    }

    @Basic
    @Column(name = "USER_LOCK_TIME")
    public Time getUserLockTime() {
        return userLockTime;
    }

    public void setUserLockTime(Time userLockTime) {
        this.userLockTime = userLockTime;
    }

    @Basic
    @Column(name = "USER_PAY_LOCK_TIME")
    public Time getUserPayLockTime() {
        return userPayLockTime;
    }

    public void setUserPayLockTime(Time userPayLockTime) {
        this.userPayLockTime = userPayLockTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAccountEntity that = (UserAccountEntity) o;

        if (userId != that.userId) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPwd != null ? !userPwd.equals(that.userPwd) : that.userPwd != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (userIdentity != null ? !userIdentity.equals(that.userIdentity) : that.userIdentity != null) return false;
        if (userAddress != null ? !userAddress.equals(that.userAddress) : that.userAddress != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;
        if (clsOperId != null ? !clsOperId.equals(that.clsOperId) : that.clsOperId != null) return false;
        if (clsDate != null ? !clsDate.equals(that.clsDate) : that.clsDate != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (userPayPwd != null ? !userPayPwd.equals(that.userPayPwd) : that.userPayPwd != null) return false;
        if (isManager != null ? !isManager.equals(that.isManager) : that.isManager != null) return false;
        if (userPwdErrNum != null ? !userPwdErrNum.equals(that.userPwdErrNum) : that.userPwdErrNum != null)
            return false;
        if (userPayPwdErrNum != null ? !userPayPwdErrNum.equals(that.userPayPwdErrNum) : that.userPayPwdErrNum != null)
            return false;
        if (userLockTime != null ? !userLockTime.equals(that.userLockTime) : that.userLockTime != null) return false;
        if (userPayLockTime != null ? !userPayLockTime.equals(that.userPayLockTime) : that.userPayLockTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPwd != null ? userPwd.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userIdentity != null ? userIdentity.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (clsOperId != null ? clsOperId.hashCode() : 0);
        result = 31 * result + (clsDate != null ? clsDate.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (userPayPwd != null ? userPayPwd.hashCode() : 0);
        result = 31 * result + (isManager != null ? isManager.hashCode() : 0);
        result = 31 * result + (userPwdErrNum != null ? userPwdErrNum.hashCode() : 0);
        result = 31 * result + (userPayPwdErrNum != null ? userPayPwdErrNum.hashCode() : 0);
        result = 31 * result + (userLockTime != null ? userLockTime.hashCode() : 0);
        result = 31 * result + (userPayLockTime != null ? userPayLockTime.hashCode() : 0);
        return result;
    }
}
