package com.liugh.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@EnableAspectJAutoProxy加上这个注解依然表示启用spring aop
public class App {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.setWebEnvironment(false);
		ConfigurableApplicationContext context = app.run(args);
        ((UserDao) context.getBean("userDao")).updateUser("liugh0");
        ((ProductDao) context.getBean("productDao")).findUser();
	}
}
