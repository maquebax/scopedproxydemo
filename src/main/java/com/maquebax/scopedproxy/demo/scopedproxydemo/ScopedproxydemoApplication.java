package com.maquebax.scopedproxy.demo.scopedproxydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopedproxydemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ScopedproxydemoApplication.class, args);
		AnnotationConfigApplicationContext appContext =  new AnnotationConfigApplicationContext(AppConfig.class);
		SingletonBean singletonBean = appContext.getBean(SingletonBean.class);

		singletonBean.showMessage();
		Thread.sleep(1000);

		singletonBean = appContext.getBean(SingletonBean.class);
		singletonBean.showMessage();
	}

}
