package com.liugh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration  
//@EnableAutoConfiguration  
//@ComponentScan
public class App2 {
	
	@Bean
	public HashMap creatRun2(){
		return new HashMap();
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
		System.out.println(context.getBean("creatRun2").toString());
	}
}
