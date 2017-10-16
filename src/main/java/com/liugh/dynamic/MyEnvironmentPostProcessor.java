package com.liugh.dynamic;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;
@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor{

	//可灵活的加入自己的逻辑来配置或集中化管理配置
	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		try(InputStream is = new FileInputStream("src/main/resources/springboot.properties")){
			Properties source = new Properties();
			source.load(is);
			PropertiesPropertySource propertySource = new PropertiesPropertySource("my",source);
			environment.getPropertySources().addLast(propertySource);
			is.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
