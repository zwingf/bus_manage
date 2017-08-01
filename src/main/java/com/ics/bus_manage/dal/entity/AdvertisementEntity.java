package com.ics.bus_manage.dal.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * 广告
 */
@Entity
@Table(name = "ADVERTISEMENT", schema = "SCOTT", catalog = "")
public class AdvertisementEntity {
    private long advertisementId;   		//广告id
    private String picUrl;          		//图片链接
    private String contentUrl;		//内容url
    private String operator;		//审核员
    private Time createDate;		//创建日期
    private Long advertStatus;		//状态
    private String cityCode;		//城市代码

    @Id
    @Column(name = "ADVERTISEMENT_ID")
    public long getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(long advertisementId) {
        this.advertisementId = advertisementId;
    }

    @Basic
    @Column(name = "PIC_URL")
    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    @Basic
    @Column(name = "CONTENT_URL")
    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
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
    @Column(name = "CREATE_DATE")
    public Time getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Time createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "ADVERT_STATUS")
    public Long getAdvertStatus() {
        return advertStatus;
    }

    public void setAdvertStatus(Long advertStatus) {
        this.advertStatus = advertStatus;
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

        AdvertisementEntity that = (AdvertisementEntity) o;

        if (advertisementId != that.advertisementId) return false;
        if (picUrl != null ? !picUrl.equals(that.picUrl) : that.picUrl != null) return false;
        if (contentUrl != null ? !contentUrl.equals(that.contentUrl) : that.contentUrl != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (advertStatus != null ? !advertStatus.equals(that.advertStatus) : that.advertStatus != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (advertisementId ^ (advertisementId >>> 32));
        result = 31 * result + (picUrl != null ? picUrl.hashCode() : 0);
        result = 31 * result + (contentUrl != null ? contentUrl.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (advertStatus != null ? advertStatus.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        return result;
    }
}
