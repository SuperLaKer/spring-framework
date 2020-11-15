package com.slk;

import com.slk.service.UserService;
import com.slk.service.UserServiceRefresh;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

@Configuration
@ComponentScan(value = "com.slk")
public class SpringApplicationContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplicationContext.class);
		UserService userService = (UserService) context.getBean("userService");
		// 注册单个bean需要手动refresh
		userService.doSth();
	}
}
