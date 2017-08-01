package com.ics.bus_manage.dal.entity;

/**
 * Created by PC on 2017/8/1.
 */
public class PayEntity {  //支付

    private int weChatPay;//微信支付

    private int aliPay;//支付宝支付

    private int icbcPay;//工商银行支付

    private int others;//其他支付方式支付

    public int getWeChatPay() {
        return weChatPay;
    }

    public void setWeChatPay(int weChatPay) {
        this.weChatPay = weChatPay;
    }

    public int getAliPay() {
        return aliPay;
    }

    public void setAliPay(int aliPay) {
        this.aliPay = aliPay;
    }

    public int getIcbcPay() {
        return icbcPay;
    }

    public void setIcbcPay(int icbcPay) {
        this.icbcPay = icbcPay;
    }

    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    public PayEntity(int weChatPay, int aliPay, int icbcPay, int others) {
        this.weChatPay = weChatPay;
        this.aliPay = aliPay;
        this.icbcPay = icbcPay;
        this.others = others;
    }
    public PayEntity() {
    }
}
