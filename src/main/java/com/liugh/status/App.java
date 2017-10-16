package com.liugh.status;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.Banner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App{
	@Bean
	public Runnable creatRun(){
		return new Runnable(){
			@Override
			public void run() {
				System.out.println("run...");
			}
			
		};
	}
    public static void main( String[] args ){
    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args); 
    	System.out.println(context.getEnvironment().getProperty("local.port"));
    	System.out.println(System.getProperty(""));
    	context.getBean(UserConfig.class).show();
//    	((UserConfig) context.getBean("userConfig")).show();
    	
//    	new SpringApplicationBuilder()
//        .sources(App.class)
//        .child(App2.class)
//        .bannerMode(Banner.Mode.OFF)
//        //.listeners(new MyListener())
//        .run(args).getBean((Runnable.class)).run();
    	
//    	System.out.println(context.getBean(App.class));
//    	SpringApplication app = new SpringApplication();
//    	Set<Object> sources = new HashSet();
//    	sources.add(App2.class);
//    	sources.add(App.class);
//    	app.setSources(sources);
//    	ConfigurableApplicationContext context2 = app.run(args);
//    	context2.getBean(Runnable.class).run();
//    	System.out.println(context2.getBean("creatRun2"));
    	
    	context.close();
    }
}
