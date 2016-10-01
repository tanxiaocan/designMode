package com.txc.strategyMode.service.impl;

import com.txc.simpleFactoryMode.service.Calculator;
import com.txc.strategyMode.service.CashStrategy;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
public class CashNormal implements CashStrategy{
    public double acceptCash(double money) {
        return money;
    }
}
