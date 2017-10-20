package com.liugh.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.liugh.aop.UserDao;

@SpringBootApplication
@EnableTransactionManagement
public class App {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.setWebEnvironment(false);
		ConfigurableApplicationContext context = app.run(args);
        ((UserDao) context.getBean("userDao")).updateUser();
	}
}
