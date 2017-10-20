package com.liugh.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication app = new  SpringApplication(App.class);
		ConfigurableApplicationContext context = app.run(args);
		
	}
}
