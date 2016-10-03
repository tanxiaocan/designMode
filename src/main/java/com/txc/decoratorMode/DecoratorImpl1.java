package com.txc.decoratorMode;

/**
 * Created by tanxiaocan on 2016/10/2.
 */
public class DecoratorImpl1 extends Decorator {
    public DecoratorImpl1(Person person) {
        super(person);
    }
    protected void dress() {
        System.out.print("牛仔裤");
    }

}
