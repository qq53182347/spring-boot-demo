package com.liugh.server;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootConfiguration
public class WebConfiguration {
	
	@Bean
	public  EmbeddedServletContainerFactory createEmbeddedServerConfig(){
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setPort(10002);
		factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));//默认public路径下
		return factory;
	}

}
