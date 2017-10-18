package com.liugh.extLearning;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.google.gson.Gson;


public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("init..."+applicationContext.getBeanDefinitionCount());
	}

}
