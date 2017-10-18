package com.liugh.eventListeners;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {

	@EventListener
	public void event(Object event){
		System.out.println("MyEventHandle...接受到的事件:"+event.getClass());
	}
	
	@EventListener
	public void event2(ContextStoppedEvent event){
		System.out.println("应用停止的事件:"+event.getClass());
	}
}
