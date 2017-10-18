package com.liugh.eventListeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextStartedEvent;

/**
 * 自定义事件
 * @author liuguanghui
 *
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication app  = new  SpringApplication(App.class);
//		app.addListeners(new MyApplicationListener());//也可以在MyApplicationListener加上注解就好了(加入到spring中管理)
		ConfigurableApplicationContext context = app.run(args);
//		context.publishEvent(new MyApplicationEvent("嘿嘿"));
		
		context.publishEvent(new MyEventHandle());
		
//		context.publishEvent(new ContextStartedEvent(context));
		context.stop();//应用停止事件记得加这句话
		context.close();
	}
}
