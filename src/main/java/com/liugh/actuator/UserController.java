package com.liugh.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private CounterService counterService;
	
	@Autowired
	private GaugeService	gaugeService;	
	
	
	@GetMapping("/user/home")
	public String home(@RequestParam("error")String error){
		if("true".equals(error)){
			throw new NullPointerException();
		}
		for (int i = 0; i < 50; i++) {
			new Thread(){
				public void run(){
					System.out.println("thread..."+Thread.currentThread().getName());
				}
			}.start();
		}
		counterService.increment("user.home.request.conut");
		return "home";
	}
	
	@GetMapping("/mp3/price")
	public String price(@RequestParam("price")Double price){
		gaugeService.submit("product.mp2.price", price);
		return "price";
	}
}
