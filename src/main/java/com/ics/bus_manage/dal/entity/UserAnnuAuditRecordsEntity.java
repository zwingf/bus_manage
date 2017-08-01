package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 年审记录表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "USER_ANNU_AUDIT_RECORDS", schema = "SCOTT", catalog = "")
public class UserAnnuAuditRecordsEntity {
    private long auditId;		//年审记录id
    private String phone;		//用户（手机号）
    private long cardType;		//卡类型
    private String name;		//姓名
    private String userIdentity;		//身份证号
    private String auditPic1;		//图片1
    private String auditPic2;		//图片2
    private String auditPic3;		//图片3
    private Time auditDate;		//审计时间
    private Long auditStatus;		//审计状态
    private String auditOperator;		//审核员
    private String cityCode;		//城市代码
    private String orderNum;		//

    @Id
    @Column(name = "AUDIT_ID")
    public long getAuditId() {
        return auditId;
    }

    public void setAuditId(long auditId) {
        this.auditId = auditId;
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
    @Column(name = "CARD_TYPE")
    public long getCardType() {
        return cardType;
    }

    public void setCardType(long cardType) {
        this.cardType = cardType;
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
    @Column(name = "AUDIT_PIC1")
    public String getAuditPic1() {
        return auditPic1;
    }

    public void setAuditPic1(String auditPic1) {
        this.auditPic1 = auditPic1;
    }

    @Basic
    @Column(name = "AUDIT_PIC2")
    public String getAuditPic2() {
        return auditPic2;
    }

    public void setAuditPic2(String auditPic2) {
        this.auditPic2 = auditPic2;
    }

    @Basic
    @Column(name = "AUDIT_PIC3")
    public String getAuditPic3() {
        return auditPic3;
    }

    public void setAuditPic3(String auditPic3) {
        this.auditPic3 = auditPic3;
    }

    @Basic
    @Column(name = "AUDIT_DATE")
    public Time getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Time auditDate) {
        this.auditDate = auditDate;
    }

    @Basic
    @Column(name = "AUDIT_STATUS")
    public Long getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Long auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Basic
    @Column(name = "AUDIT_OPERATOR")
    public String getAuditOperator() {
        return auditOperator;
    }

    public void setAuditOperator(String auditOperator) {
        this.auditOperator = auditOperator;
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
    @Column(name = "ORDER_NUM")
    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAnnuAuditRecordsEntity that = (UserAnnuAuditRecordsEntity) o;

        if (auditId != that.auditId) return false;
        if (cardType != that.cardType) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (userIdentity != null ? !userIdentity.equals(that.userIdentity) : that.userIdentity != null) return false;
        if (auditPic1 != null ? !auditPic1.equals(that.auditPic1) : that.auditPic1 != null) return false;
        if (auditPic2 != null ? !auditPic2.equals(that.auditPic2) : that.auditPic2 != null) return false;
        if (auditPic3 != null ? !auditPic3.equals(that.auditPic3) : that.auditPic3 != null) return false;
        if (auditDate != null ? !auditDate.equals(that.auditDate) : that.auditDate != null) return false;
        if (auditStatus != null ? !auditStatus.equals(that.auditStatus) : that.auditStatus != null) return false;
        if (auditOperator != null ? !auditOperator.equals(that.auditOperator) : that.auditOperator != null)
            return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (orderNum != null ? !orderNum.equals(that.orderNum) : that.orderNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (auditId ^ (auditId >>> 32));
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (int) (cardType ^ (cardType >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userIdentity != null ? userIdentity.hashCode() : 0);
        result = 31 * result + (auditPic1 != null ? auditPic1.hashCode() : 0);
        result = 31 * result + (auditPic2 != null ? auditPic2.hashCode() : 0);
        result = 31 * result + (auditPic3 != null ? auditPic3.hashCode() : 0);
        result = 31 * result + (auditDate != null ? auditDate.hashCode() : 0);
        result = 31 * result + (auditStatus != null ? auditStatus.hashCode() : 0);
        result = 31 * result + (auditOperator != null ? auditOperator.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        return result;
    }
}
