package com.ics.bus_manage.dal.entity;

import java.util.Date;

/**
 * Created by PC on 2017/8/1.
 */
public class TradeMessageEntity {//交易

    private long tradeDate;//日期

    private double tradeNo;//交易额

    public long getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(long tradeDate) {
        this.tradeDate = tradeDate;
    }

    public double getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(double tradeNo) {
        this.tradeNo = tradeNo;
    }

    public TradeMessageEntity() {
    }
    public TradeMessageEntity(long tradeDate, double tradeNo) {
        this.tradeDate = tradeDate;
        this.tradeNo = tradeNo;
    }
}
