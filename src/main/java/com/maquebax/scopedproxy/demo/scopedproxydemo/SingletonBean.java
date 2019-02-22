package com.maquebax.scopedproxy.demo.scopedproxydemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vignesh on 22-02-2019.
 */
public class SingletonBean {
    @Autowired
    PrototypeBean prototypeBean;

    public void showMessage(){
        System.out.println("The time shown by singleton bean "+prototypeBean.getpDate());
    }
}
