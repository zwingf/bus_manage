package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 用户操作记录
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "USER_ACTION_RECORDS", schema = "SCOTT", catalog = "")
public class UserActionRecordsEntity {
    private long actionId;
    private Long userId;
    private Long actionType;//1: 卡片查询 2:NFC充值 3:360借条 4:手环充值 5:补登充值 6:理财产品 7:海淘商城 8:线路查询 9:社保代缴 10:微商城
    private Time actionTime;//操作时间

    @Id
    @Column(name = "ACTION_ID")
    public long getActionId() {
        return actionId;
    }

    public void setActionId(long actionId) {
        this.actionId = actionId;
    }

    @Basic
    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ACTION_TYPE")
    public Long getActionType() {
        return actionType;
    }

    public void setActionType(Long actionType) {
        this.actionType = actionType;
    }

    @Basic
    @Column(name = "ACTION_TIME")
    public Time getActionTime() {
        return actionTime;
    }

    public void setActionTime(Time actionTime) {
        this.actionTime = actionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserActionRecordsEntity that = (UserActionRecordsEntity) o;

        if (actionId != that.actionId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (actionType != null ? !actionType.equals(that.actionType) : that.actionType != null) return false;
        if (actionTime != null ? !actionTime.equals(that.actionTime) : that.actionTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (actionId ^ (actionId >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (actionType != null ? actionType.hashCode() : 0);
        result = 31 * result + (actionTime != null ? actionTime.hashCode() : 0);
        return result;
    }
}
