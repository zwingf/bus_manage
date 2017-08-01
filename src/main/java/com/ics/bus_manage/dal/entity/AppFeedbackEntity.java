package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 手机APP意见反馈表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "APP_FEEDBACK", schema = "SCOTT", catalog = "")
public class AppFeedbackEntity {
    private int feedbackId;		//序列号
    private String feedbackContent;		//内容
    private String mobileNo;		//手机号
    private String note;		//备注
    private Time operTime;		//操作时间
    private String userName;		//用户名

    @Id
    @Column(name = "FEEDBACK_ID")
    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    @Basic
    @Column(name = "FEEDBACK_CONTENT")
    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
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
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "OPER_TIME")
    public Time getOperTime() {
        return operTime;
    }

    public void setOperTime(Time operTime) {
        this.operTime = operTime;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppFeedbackEntity that = (AppFeedbackEntity) o;

        if (feedbackId != that.feedbackId) return false;
        if (feedbackContent != null ? !feedbackContent.equals(that.feedbackContent) : that.feedbackContent != null)
            return false;
        if (mobileNo != null ? !mobileNo.equals(that.mobileNo) : that.mobileNo != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (operTime != null ? !operTime.equals(that.operTime) : that.operTime != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = feedbackId;
        result = 31 * result + (feedbackContent != null ? feedbackContent.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (operTime != null ? operTime.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
