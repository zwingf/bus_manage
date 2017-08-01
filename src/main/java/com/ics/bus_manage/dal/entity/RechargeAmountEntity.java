package com.ics.bus_manage.dal.entity;

/**
 * Created by PC on 2017/8/1.
 */
public class RechargeAmountEntity {//充值频率

    private int simRechargeAmount;//sim充值频率

    private int largeRechargeAmount;//大卡充值频率

    private int terminalRechargeAmount;//手环/全终端充值频率

    private int bluetoothRechargeAmount;//蓝牙读卡器充值频率

    private int fillUpRechargeAmount;//补登充值频率

    public int getSimRechargeAmount() {
        return simRechargeAmount;
    }

    public void setSimRechargeAmount(int simRechargeAmount) {
        this.simRechargeAmount = simRechargeAmount;
    }

    public int getLargeRechargeAmount() {
        return largeRechargeAmount;
    }

    public void setLargeRechargeAmount(int largeRechargeAmount) {
        this.largeRechargeAmount = largeRechargeAmount;
    }

    public int getTerminalRechargeAmount() {
        return terminalRechargeAmount;
    }

    public void setTerminalRechargeAmount(int terminalRechargeAmount) {
        this.terminalRechargeAmount = terminalRechargeAmount;
    }

    public int getBluetoothRechargeAmount() {
        return bluetoothRechargeAmount;
    }

    public void setBluetoothRechargeAmount(int bluetoothRechargeAmount) {
        this.bluetoothRechargeAmount = bluetoothRechargeAmount;
    }

    public int getFillUpRechargeAmount() {
        return fillUpRechargeAmount;
    }

    public void setFillUpRechargeAmount(int fillUpRechargeAmount) {
        this.fillUpRechargeAmount = fillUpRechargeAmount;
    }

    public RechargeAmountEntity() {
    }

    public RechargeAmountEntity(int simRechargeAmount, int largeRechargeAmount, int terminalRechargeAmount, int bluetoothRechargeAmount, int fillUpRechargeAmount) {
        this.simRechargeAmount = simRechargeAmount;
        this.largeRechargeAmount = largeRechargeAmount;
        this.terminalRechargeAmount = terminalRechargeAmount;
        this.bluetoothRechargeAmount = bluetoothRechargeAmount;
        this.fillUpRechargeAmount = fillUpRechargeAmount;
    }
}
