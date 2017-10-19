package com.liugh.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	
	//EmbeddedServletContainerAutoConfiguration类里有springboot配置的3种服务器
	public static void main(String[] args) {
		SpringApplication app =new SpringApplication(App.class);
		ConfigurableApplicationContext context = app.run(args);
	}

}
