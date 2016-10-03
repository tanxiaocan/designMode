package com.txc.decoratorMode;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by tanxiaocan on 2016/10/2.
 */
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    public void show(){
        System.out.println(name + "的穿着:");
    };
}
