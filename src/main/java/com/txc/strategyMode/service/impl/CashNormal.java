package com.txc.strategyMode.service.impl;

import com.txc.strategyMode.service.CashStrategy;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
public class CashNormal implements CashStrategy {
    public double acceptCash(double money) {
        return money;
    }

    public void setInitParams(double... params) {

    }
}
