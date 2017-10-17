package com.liugh.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:config/jdbc.properties")
@PropertySources({@PropertySource("classpath:config/jdbc.properties"),@PropertySource("classpath:app.properties")})
public class JdbcConfig {
	
	//配置可以为空,如果没有配置,再给9090
	@Value("${tomcat.port:9091}")
	private String tomcatPort;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.driverClass}")
	private String driverClass;
	
	@Value("${dubbo.port}")
	private String dubboPort;
	
	@Value("${dubbo.host}")
	private String dubboHost;
	
	@Value("${app.name}")
	private String appName;
	
	public void show(){
		System.out.println("url..."+url);
		
		System.out.println("driverClass..."+driverClass);
		
		System.out.println("dubboPort..."+dubboPort);
		
		System.out.println("dubboHost..."+dubboHost);
		
		
		System.out.println("appName..."+appName);
		
		System.out.println("tomcatPort..."+tomcatPort);
	}
}

