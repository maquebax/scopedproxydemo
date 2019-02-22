package com.maquebax.scopedproxy.demo.scopedproxydemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.Date;

/**
 * Created by vignesh on 22-02-2019.
 */
@Configuration
public class AppConfig {

    @Bean
    @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PrototypeBean myPrototypeBean(){
        return new PrototypeBean(new Date());
    }

    @Bean
    public SingletonBean mySingletoneBean(){
        return new SingletonBean();
    }

}
