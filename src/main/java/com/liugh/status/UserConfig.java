package com.liugh.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

	@Value("${local.myPort}")
	private String localMyPort;
	
	
	@Autowired
	private Environment env;
	
	public void show(){
		System.out.println("UserConfig.show()..."+env.getProperty("local.port"));
		
		System.out.println("UserConfig.show()..."+localMyPort);
	}
}
