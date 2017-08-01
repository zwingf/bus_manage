package com.ics.bus_manage.dal.entity;

/**
 * Created by PC on 2017/8/1.
 */
public class RechargeMessageEntity {//渠道营收

    private int simRecharge;//sim充值

    private int largeRecharge;//大卡充值

    private int terminalRecharge;//手环/全终端充值

    private int bluetoothRecharge;//蓝牙读卡器充值

    private int fillUpRecharge;//补登充值

    private int IOUs360;//360借条

    private int socialSecurityPayment;//社保代缴

    private int microMall;//微商城

    private int financialProduct;//理财产品

    private int seaAmoyMall;//海淘商城

    public RechargeMessageEntity() {
    }

    public RechargeMessageEntity(int simRecharge, int largeRecharge, int terminalRecharge, int bluetoothRecharge, int fillUpRecharge, int IOUs360, int socialSecurityPayment, int microMall, int financialProduct, int seaAmoyMall) {
        this.simRecharge = simRecharge;
        this.largeRecharge = largeRecharge;
        this.terminalRecharge = terminalRecharge;
        this.bluetoothRecharge = bluetoothRecharge;
        this.fillUpRecharge = fillUpRecharge;
        this.IOUs360 = IOUs360;
        this.socialSecurityPayment = socialSecurityPayment;
        this.microMall = microMall;
        this.financialProduct = financialProduct;
        this.seaAmoyMall = seaAmoyMall;
    }

    public int getSimRecharge() {
        return simRecharge;
    }

    public void setSimRecharge(int simRecharge) {
        this.simRecharge = simRecharge;
    }

    public int getLargeRecharge() {
        return largeRecharge;
    }

    public void setLargeRecharge(int largeRecharge) {
        this.largeRecharge = largeRecharge;
    }

    public int getTerminalRecharge() {
        return terminalRecharge;
    }

    public void setTerminalRecharge(int terminalRecharge) {
        this.terminalRecharge = terminalRecharge;
    }

    public int getBluetoothRecharge() {
        return bluetoothRecharge;
    }

    public void setBluetoothRecharge(int bluetoothRecharge) {
        this.bluetoothRecharge = bluetoothRecharge;
    }

    public int getFillUpRecharge() {
        return fillUpRecharge;
    }

    public void setFillUpRecharge(int fillUpRecharge) {
        this.fillUpRecharge = fillUpRecharge;
    }

    public int getIOUs360() {
        return IOUs360;
    }

    public void setIOUs360(int IOUs360) {
        this.IOUs360 = IOUs360;
    }

    public int getSocialSecurityPayment() {
        return socialSecurityPayment;
    }

    public void setSocialSecurityPayment(int socialSecurityPayment) {
        this.socialSecurityPayment = socialSecurityPayment;
    }

    public int getMicroMall() {
        return microMall;
    }

    public void setMicroMall(int microMall) {
        this.microMall = microMall;
    }

    public int getFinancialProduct() {
        return financialProduct;
    }

    public void setFinancialProduct(int financialProduct) {
        this.financialProduct = financialProduct;
    }

    public int getSeaAmoyMall() {
        return seaAmoyMall;
    }

    public void setSeaAmoyMall(int seaAmoyMall) {
        this.seaAmoyMall = seaAmoyMall;
    }
}
