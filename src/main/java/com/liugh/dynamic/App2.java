package com.liugh.dynamic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Conditional;

/**
 * 或者开发环境和测试环境不一样,需要激活某项配置
 * @author liuguanghui
 *
 */
@SpringBootApplication
public class App2 {
//	@Conditional
	
	
	public static void main(String[] args) {
		SpringApplication app  =new SpringApplication(App2.class);
		//app.setAdditionalProfiles("dev");
		app.setAdditionalProfiles("test");
		ConfigurableApplicationContext context = app.run(args);
		
		System.out.println(context.getEnvironment().getProperty("jdbc_url"));
		
		context.close();
	}

}
