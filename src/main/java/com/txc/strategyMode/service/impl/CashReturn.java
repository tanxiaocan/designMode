package com.txc.strategyMode.service.impl;

import com.txc.strategyMode.service.CashStrategy;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
public class CashReturn implements CashStrategy {
    private double criticalMoney;
    private double returnMoney;
    public double acceptCash(double money) {
        return money > criticalMoney ? money - returnMoney * Math.ceil(money / criticalMoney) : money;
    }

    public void setInitParams(double... params) {
        if(params.length != 2){
            throw new RuntimeException();
        }
        this.criticalMoney = params[0];
        this.returnMoney = params[1];
    }
}
