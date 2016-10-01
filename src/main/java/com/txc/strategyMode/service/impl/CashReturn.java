package com.txc.strategyMode.service.impl;

import com.txc.strategyMode.service.CashStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CashReturn implements CashStrategy {
    private double criticalMoney;
    private double returnMoney;
    public double acceptCash(double money) {
        return money > criticalMoney ? money - returnMoney * Math.ceil(money / criticalMoney) : money;
    }
}
