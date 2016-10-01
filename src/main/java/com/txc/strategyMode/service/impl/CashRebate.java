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
public class CashRebate implements CashStrategy {
    private double rebateRate;
    public double acceptCash(double money) {
        return money * rebateRate;
    }
}
