package com.maquebax.scopedproxy.demo.scopedproxydemo;

import java.util.Date;

/**
 * Created by vignesh on 22-02-2019.
 */
public class PrototypeBean {
    PrototypeBean(Date date){
        this.pDate = date;
    }
    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    Date pDate;

}
