package com.liugh.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	
	@Before("execution(* com.liugh.aop..*.*(..) )")
	public void  beforeLog(){
		System.out.println("before log....");
	}
	
	
	@After("execution(* com.liugh.aop..*.*(..) )")
	public void   afterLog(JoinPoint  point){
		System.out.println("after log....目标类:"+point.getTarget().getClass()+"   参数:"+Arrays.asList(point.getArgs()));
	}

}
