package com.txc.decoratorMode;

/**
 * Created by tanxiaocan on 2016/10/2.
 */
public class DecoratorImpl2 extends Decorator {
    public DecoratorImpl2(Person person) {
        super(person);
    }
    protected void dress() {
        System.out.print("风衣");
    }

}
