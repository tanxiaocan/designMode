package com.txc.strategyMode.factory;

import com.txc.strategyMode.service.CashStrategy;
import java.lang.reflect.Method;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
public class CashContext {
    private CashStrategy cashStrategy;
    public CashContext(String className,double... params){
        try {
            String currentPackageName = this.getClass().getPackage().getName();
            className = currentPackageName.replace("factory","impl.") + className;
            Class<CashStrategy> cashStrategyClass = (Class<CashStrategy>) Class.forName(className);
            cashStrategy = cashStrategyClass.newInstance();
            Method setInitParams = cashStrategyClass.getMethod("setInitParams",double[].class);
            setInitParams.invoke(cashStrategy,params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double getResult(double money){
        return cashStrategy.acceptCash(money);
    }
}
