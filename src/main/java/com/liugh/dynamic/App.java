package com.liugh.dynamic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.liugh.status.UserConfig;

@SpringBootApplication
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		SpringApplication sa  = new SpringApplication(App.class);
		ConfigurableApplicationContext context = sa.run(args);
		SpringApplication.run(App.class, args);
		
		context.getBean(MyEnvironmentPostProcessor.class);
		System.out.println(context.getEnvironment().getProperty("name"));
		System.out.println(context.getEnvironment().getProperty("my.name"));
		
		String name = "liugh";
		String password = "123456";
		logger.debug("debug...");
		logger.info("name = "+name+"  password="+password);
		logger.error("error...");
		context.close();
	}

}
