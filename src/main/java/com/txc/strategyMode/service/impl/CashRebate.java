package com.txc.strategyMode.service.impl;

import com.txc.strategyMode.service.CashStrategy;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
@Getter
@Setter
public class CashRebate implements CashStrategy {
    private double rebateRate;
    public double acceptCash(double money) {
        return money * rebateRate;
    }

    public void setInitParams(double... params) {
        if(params == null || params.length != 1){
            throw new RuntimeException();
        }
        this.rebateRate = params[0];
    }

}
