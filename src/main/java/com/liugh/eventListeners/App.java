package com.liugh.eventListeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 自定义事件
 * @author liuguanghui
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication app  = new  SpringApplication(App.class);
		app.addListeners(new MyApplicationListener());
		ConfigurableApplicationContext context = app.run(args);
		context.publishEvent(new MyApplicationEvent("嘿嘿"));
		
		context.close();
	}
}
