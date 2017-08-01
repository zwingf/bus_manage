package com.ics.bus_manage.dal.entity;

import javax.persistence.*;

/**
 * 公告表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "NOTICE", schema = "SCOTT", catalog = "")
public class NoticeEntity {
    private long noticeId;		//通知id
    private long noticeType;		//类型
    private String noticeTitle;		//标题
    private String noticeContent;		//通知内容
    private long noticeStatus;		//通知状态
    private String noticeOperator;		//操作员
    private String cityCode;		//城市代码

    @Id
    @Column(name = "NOTICE_ID")
    public long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(long noticeId) {
        this.noticeId = noticeId;
    }

    @Basic
    @Column(name = "NOTICE_TYPE")
    public long getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(long noticeType) {
        this.noticeType = noticeType;
    }

    @Basic
    @Column(name = "NOTICE_TITLE")
    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    @Basic
    @Column(name = "NOTICE_CONTENT")
    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    @Basic
    @Column(name = "NOTICE_STATUS")
    public long getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(long noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    @Basic
    @Column(name = "NOTICE_OPERATOR")
    public String getNoticeOperator() {
        return noticeOperator;
    }

    public void setNoticeOperator(String noticeOperator) {
        this.noticeOperator = noticeOperator;
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

        NoticeEntity that = (NoticeEntity) o;

        if (noticeId != that.noticeId) return false;
        if (noticeType != that.noticeType) return false;
        if (noticeStatus != that.noticeStatus) return false;
        if (noticeTitle != null ? !noticeTitle.equals(that.noticeTitle) : that.noticeTitle != null) return false;
        if (noticeContent != null ? !noticeContent.equals(that.noticeContent) : that.noticeContent != null)
            return false;
        if (noticeOperator != null ? !noticeOperator.equals(that.noticeOperator) : that.noticeOperator != null)
            return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (noticeId ^ (noticeId >>> 32));
        result = 31 * result + (int) (noticeType ^ (noticeType >>> 32));
        result = 31 * result + (noticeTitle != null ? noticeTitle.hashCode() : 0);
        result = 31 * result + (noticeContent != null ? noticeContent.hashCode() : 0);
        result = 31 * result + (int) (noticeStatus ^ (noticeStatus >>> 32));
        result = 31 * result + (noticeOperator != null ? noticeOperator.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        return result;
    }
}
