package com.ics.bus_manage.dal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户办卡记录表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "USER_APPLY_RECORDS", schema = "SCOTT", catalog = "")
public class UserApplyRecordsEntity {
    private long applyId;		//	申请id
    private String phone;		//	用户（手机号）
    private Long cardType;		//	卡类型
    private String name;		//	姓名
    private String userIdentity;		//	身份证号
    private String userAddress;		//	住址
    private String studentCode;		//	学籍号
    private String pic1;		//	图片1（证件照）
    private String pic2;		//	图片2（其他图片）
    private String pic3;		//	图片3（备用）
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date applyTime;		//	申请时间
    private long applyStatus;		//	进度状态
    private long applyType;		//	操作类型（1申领2补办）
    private String operator;		//	审核员
    private String cityCode;		//	城市代码
    private String orderNum;		//

    @Id
    @Column(name = "APPLY_ID")
    public long getApplyId() {
        return applyId;
    }

    public void setApplyId(long applyId) {
        this.applyId = applyId;
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
    public Long getCardType() {
        return cardType;
    }

    public void setCardType(Long cardType) {
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
    @Column(name = "USER_ADDRESS")
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Basic
    @Column(name = "STUDENT_CODE")
    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Basic
    @Column(name = "PIC1")
    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    @Basic
    @Column(name = "PIC2")
    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    @Basic
    @Column(name = "PIC3")
    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    @Basic
    @Column(name = "APPLY_TIME")
    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    @Basic
    @Column(name = "APPLY_STATUS")
    public long getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(long applyStatus) {
        this.applyStatus = applyStatus;
    }

    @Basic
    @Column(name = "APPLY_TYPE")
    public long getApplyType() {
        return applyType;
    }

    public void setApplyType(long applyType) {
        this.applyType = applyType;
    }

    @Basic
    @Column(name = "OPERATOR")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

        UserApplyRecordsEntity that = (UserApplyRecordsEntity) o;

        if (applyId != that.applyId) return false;
        if (applyStatus != that.applyStatus) return false;
        if (applyType != that.applyType) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (cardType != null ? !cardType.equals(that.cardType) : that.cardType != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (userIdentity != null ? !userIdentity.equals(that.userIdentity) : that.userIdentity != null) return false;
        if (userAddress != null ? !userAddress.equals(that.userAddress) : that.userAddress != null) return false;
        if (studentCode != null ? !studentCode.equals(that.studentCode) : that.studentCode != null) return false;
        if (pic1 != null ? !pic1.equals(that.pic1) : that.pic1 != null) return false;
        if (pic2 != null ? !pic2.equals(that.pic2) : that.pic2 != null) return false;
        if (pic3 != null ? !pic3.equals(that.pic3) : that.pic3 != null) return false;
        if (applyTime != null ? !applyTime.equals(that.applyTime) : that.applyTime != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (orderNum != null ? !orderNum.equals(that.orderNum) : that.orderNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (applyId ^ (applyId >>> 32));
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userIdentity != null ? userIdentity.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (studentCode != null ? studentCode.hashCode() : 0);
        result = 31 * result + (pic1 != null ? pic1.hashCode() : 0);
        result = 31 * result + (pic2 != null ? pic2.hashCode() : 0);
        result = 31 * result + (pic3 != null ? pic3.hashCode() : 0);
        result = 31 * result + (applyTime != null ? applyTime.hashCode() : 0);
        result = 31 * result + (int) (applyStatus ^ (applyStatus >>> 32));
        result = 31 * result + (int) (applyType ^ (applyType >>> 32));
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        return result;
    }
}
