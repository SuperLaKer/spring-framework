package com.slk;

import com.slk.selectors.USelector;
import com.slk.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = "com.slk")
//@Import(DaoImportRegistrar.class)
@Import(USelector.class)
public class SpringApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringApplication.class, AppConfig.class);
		context.register(AppConfig.class);
		UserService userService = (UserService) context.getBean("userService");
		// 接口通过factoryBean完成了对象的创建
		// 如何在取出对象的时候直接使用对象的名字？需要修改bd中的beanName
//		UserDao userDao = (UserDao) context.getBean(UserDao.class);
//		userDao.query("..");

//		UserDao userDao1 = (UserDao) context.getBean("userDao");
//		userDao1.query("xxx");
		System.out.println("\n"+context.getBeanDefinitionNames().length);
	}
}
