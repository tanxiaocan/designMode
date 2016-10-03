package com.txc.decoratorMode;

/**
 * Created by tanxiaocan on 2016/10/2.
 */
public class DecoratorImpl3 extends Decorator {
    public DecoratorImpl3(Person person) {
        super(person);
    }
    protected void dress() {
        System.out.print("板鞋");
    }

}
