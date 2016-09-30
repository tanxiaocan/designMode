package com.txc.simpleFactoryMode.service.impl;

import com.txc.simpleFactoryMode.service.Calculator;

/**
 * Created by xiaocantan on 2016/9/30.
 */
public class ReduceCalculator implements Calculator{
    public double doCount(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
