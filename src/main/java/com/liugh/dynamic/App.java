package com.liugh.dynamic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.liugh.status.UserConfig;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication sa  = new SpringApplication(App.class);
		ConfigurableApplicationContext context = sa.run(args);
		
		context.getBean(MyEnvironmentPostProcessor.class);
		System.out.println(context.getEnvironment().getProperty("name"));
		System.out.println(context.getEnvironment().getProperty("my.name"));
		
		
		context.close();
	}

}
