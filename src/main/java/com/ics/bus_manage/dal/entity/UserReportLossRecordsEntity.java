package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 挂失记录表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "USER_REPORT_LOSS_RECORDS", schema = "SCOTT", catalog = "")
public class UserReportLossRecordsEntity {
    private long repordLossId;		//挂失记录id
    private String phone;		//用户（手机号）
    private String name;		//姓名
    private String userIdentity;		//身份证号
    private Time reportTime;		//操作时间
    private long reportStatus;		//进度状态
    private String cityCode;		//城市代码
    private String orderNum;

    @Id
    @Column(name = "REPORD_LOSS_ID")
    public long getRepordLossId() {
        return repordLossId;
    }

    public void setRepordLossId(long repordLossId) {
        this.repordLossId = repordLossId;
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
    @Column(name = "REPORT_TIME")
    public Time getReportTime() {
        return reportTime;
    }

    public void setReportTime(Time reportTime) {
        this.reportTime = reportTime;
    }

    @Basic
    @Column(name = "REPORT_STATUS")
    public long getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(long reportStatus) {
        this.reportStatus = reportStatus;
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

        UserReportLossRecordsEntity that = (UserReportLossRecordsEntity) o;

        if (repordLossId != that.repordLossId) return false;
        if (reportStatus != that.reportStatus) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (userIdentity != null ? !userIdentity.equals(that.userIdentity) : that.userIdentity != null) return false;
        if (reportTime != null ? !reportTime.equals(that.reportTime) : that.reportTime != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;
        if (orderNum != null ? !orderNum.equals(that.orderNum) : that.orderNum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (repordLossId ^ (repordLossId >>> 32));
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userIdentity != null ? userIdentity.hashCode() : 0);
        result = 31 * result + (reportTime != null ? reportTime.hashCode() : 0);
        result = 31 * result + (int) (reportStatus ^ (reportStatus >>> 32));
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        return result;
    }
}
