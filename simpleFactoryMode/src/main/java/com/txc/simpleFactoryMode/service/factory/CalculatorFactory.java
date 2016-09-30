package com.txc.simpleFactoryMode.service.factory;

import com.txc.simpleFactoryMode.service.Calculator;
import com.txc.simpleFactoryMode.service.impl.AddCalculator;

/**
 * Created by xiaocantan on 2016/9/30.
 */
public class CalculatorFactory {
    public static Calculator getCalculatorInstance(String operation){
        return new AddCalculator();
    }
}
