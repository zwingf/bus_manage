package com.ics.bus_manage.dal.entity;

import javax.persistence.*;

/**
 * 营业网点信息表
 * Created by wing on 2017/8/1.
 */
@Entity
@Table(name = "BUSI_OUTLET_INFO", schema = "SCOTT", catalog = "")
public class BusiOutletInfoEntity {
    private long outletId;		//营业网点id
    private String outletAddress;		//网点地址
    private String contactWay;		//联系方式
    private String cityCode;		//城市代码

    @Id
    @Column(name = "OUTLET_ID")
    public long getOutletId() {
        return outletId;
    }

    public void setOutletId(long outletId) {
        this.outletId = outletId;
    }

    @Basic
    @Column(name = "OUTLET_ADDRESS")
    public String getOutletAddress() {
        return outletAddress;
    }

    public void setOutletAddress(String outletAddress) {
        this.outletAddress = outletAddress;
    }

    @Basic
    @Column(name = "CONTACT_WAY")
    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
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

        BusiOutletInfoEntity that = (BusiOutletInfoEntity) o;

        if (outletId != that.outletId) return false;
        if (outletAddress != null ? !outletAddress.equals(that.outletAddress) : that.outletAddress != null)
            return false;
        if (contactWay != null ? !contactWay.equals(that.contactWay) : that.contactWay != null) return false;
        if (cityCode != null ? !cityCode.equals(that.cityCode) : that.cityCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (outletId ^ (outletId >>> 32));
        result = 31 * result + (outletAddress != null ? outletAddress.hashCode() : 0);
        result = 31 * result + (contactWay != null ? contactWay.hashCode() : 0);
        result = 31 * result + (cityCode != null ? cityCode.hashCode() : 0);
        return result;
    }
}
