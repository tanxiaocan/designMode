package com.txc.simpleFactoryMode.factory;

import com.txc.simpleFactoryMode.service.impl.AddCalculator;
import com.txc.simpleFactoryMode.service.Calculator;
import com.txc.simpleFactoryMode.service.impl.ReduceCalculator;

/**
 * Created by xiaocantan on 2016/9/30.
 */
public class CalculatorFactory {
    public static Calculator getCalculatorInstance(CalculatorType operation){
        switch (operation){
            case ADD:return new AddCalculator();
            case REDUCE:return new ReduceCalculator();
            default:return null;
        }
    }

    public enum CalculatorType{
        ADD,REDUCE
    }
}
