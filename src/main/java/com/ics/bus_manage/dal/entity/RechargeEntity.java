package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by yangguang on 2017/8/3.
 */
/*@Entity
@Table(name = "RECHARGE", schema = "SCOTT", catalog = "")*/
public class RechargeEntity {
    private long id;
    private String serial;
    private String type;
    private String cardNo;
    private String mobileNo;
    private Long rechargeAmount;
    private Time rechargeTime;
    private String orderStatus;
    private String reason;
    private String refundStatus;
    private Long pageNo;
    private Long pageSize;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SERIAL")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "CARD_NO")
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Basic
    @Column(name = "MOBILE_NO")
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Basic
    @Column(name = "RECHARGE_AMOUNT")
    public Long getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Long rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    @Basic
    @Column(name = "RECHARGE_TIME")
    public Time getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Time rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    @Basic
    @Column(name = "ORDER_STATUS")
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "REASON")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "REFUND_STATUS")
    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Basic
    @Column(name = "PAGE_NO")
    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    @Basic
    @Column(name = "PAGE_SIZE")
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RechargeEntity that = (RechargeEntity) o;

        if (id != that.id) return false;
        if (serial != null ? !serial.equals(that.serial) : that.serial != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (cardNo != null ? !cardNo.equals(that.cardNo) : that.cardNo != null) return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;
        if (rechargeAmount != null ? !rechargeAmount.equals(that.rechargeAmount) : that.rechargeAmount != null)
            return false;
        if (rechargeTime != null ? !rechargeTime.equals(that.rechargeTime) : that.rechargeTime != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (refundStatus != null ? !refundStatus.equals(that.refundStatus) : that.refundStatus != null) return false;
        if (pageNo != null ? !pageNo.equals(that.pageNo) : that.pageNo != null) return false;
        if (pageSize != null ? !pageSize.equals(that.pageSize) : that.pageSize != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (cardNo != null ? cardNo.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (rechargeAmount != null ? rechargeAmount.hashCode() : 0);
        result = 31 * result + (rechargeTime != null ? rechargeTime.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (refundStatus != null ? refundStatus.hashCode() : 0);
        result = 31 * result + (pageNo != null ? pageNo.hashCode() : 0);
        result = 31 * result + (pageSize != null ? pageSize.hashCode() : 0);
        return result;
    }
}
