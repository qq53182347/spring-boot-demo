package com.liugh.extLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * CommandLineRunner和ApplicationArgument一样,都是在容器启动成功后的最后一步回调
 * 区别是ApplicationArguments的润方法对参数进行了最后一步的封装
 * @author liuguanghui
 *
 */
@Order(1)
@Component
public class MyCommandLineRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("----应用启动成功1-----");
	}

}
