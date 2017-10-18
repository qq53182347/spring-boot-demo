package com.liugh.extLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ConfigurableApplicationContext;

import com.google.gson.Gson;

@EnableAutoConfiguration(excludeName="com.liugh.extLearning.User")
@SpringBootApplication
@ConditionalOnClass(Gson.class)
public class App {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(App.class);
		app.addInitializers(new MyApplicationContextInitializer());
		ConfigurableApplicationContext context = app.run(args);
		System.out.println(context.getBean(User.class));
		System.out.println(context.getBean(Gson.class));
		context.close();
		
	}
}
