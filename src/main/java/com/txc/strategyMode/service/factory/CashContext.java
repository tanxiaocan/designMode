package com.txc.strategyMode.service.factory;

import com.txc.strategyMode.service.CashStrategy;
import java.lang.reflect.Method;
import static javafx.scene.input.KeyCode.M;

/**
 * Created by tanxiaocan on 2016/10/1.
 */
public class CashContext {
    private CashStrategy cashStrategy;
    public CashContext(String className){
        try {
            String currentPackageName = this.getClass().getPackage().getName();
            className = currentPackageName.replace("factory","impl.") + className;
            Class<CashStrategy> cashStrategyClass = (Class<CashStrategy>) Class.forName(className);
            cashStrategy = cashStrategyClass.newInstance();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
