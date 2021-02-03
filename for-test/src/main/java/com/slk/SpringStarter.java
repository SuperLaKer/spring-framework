package com.slk;


import com.slk.beans.DemoBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class SpringStarter {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(ConfigurationClass.class);
		applicationContext.refresh();

		DemoBean1 bean = applicationContext.getBean(DemoBean1.class);
		bean.sayHi();
	}
}

@ComponentScan("com.slk")
class ConfigurationClass{
}
