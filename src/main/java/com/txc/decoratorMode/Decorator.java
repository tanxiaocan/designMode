package com.txc.decoratorMode;

/**
 * Created by tanxiaocan on 2016/10/2.
 */
public abstract class Decorator extends Person {
    private Person person;
    public Decorator(Person person){
        this.person = person;
    }
    @Override
    public void show(){
        dress();
        person.show();
    }

    protected abstract void dress();
}
