package com.liugh.jdbc;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事物
@EnableTransactionManagement
public class App {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		//DataSourceAutoConfiguration中有四种默认的数据源
		//默认org.apache.tomcat.jdbc.pool.DataSource
		System.out.println("数据源:"+context.getBean(DataSource.class));
		DataSource ds = context.getBean(DataSource.class);
		Connection connection = ds.getConnection();
		System.out.println(connection.getCatalog());
		connection.close();
		System.out.println(JdbcTemplate.class);
		context.getBean(UserDao.class).findUser();
		
		System.out.println("---自定义数据源----");
        DataSource createDataSource = context.getBean(DruidDBConfiguration.class).createDataSource();
        System.out.println(createDataSource.getClass());
        context.getBean(UserDao.class).upcateUser();
        
		
	}
}
