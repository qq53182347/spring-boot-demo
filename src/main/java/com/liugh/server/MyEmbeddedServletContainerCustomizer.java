package com.liugh.server;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

	public void customize(ConfigurableEmbeddedServletContainer container) {
		TomcatEmbeddedServletContainerFactory factory = (TomcatEmbeddedServletContainerFactory)container;
		factory.setPort(10003);
		factory.addConnectorCustomizers(new MyTomcatConnectorCustomizers());
	}

}
class MyTomcatConnectorCustomizers implements TomcatConnectorCustomizer{

	public void customize(Connector connector) {
		Http11NioProtocol protocol = (Http11NioProtocol)connector.getProtocolHandler();
		protocol.setMaxThreads(200);//设置最大链接数
		protocol.setMaxConnections(1000);
	}
	
}