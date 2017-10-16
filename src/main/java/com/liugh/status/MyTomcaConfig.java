package com.liugh.status;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("tomcat")
public class MyTomcaConfig {

	private List<String> hosts = new ArrayList<String>();

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	@Override
	public String toString() {
		return "MyTomcaConfig [hosts=" + hosts + "]";
	}
	
}
