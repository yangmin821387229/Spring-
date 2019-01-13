package com.tutorialspoint;
import javax.annotation.*;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}
    
	public void setMessage(String message) {
		this.message = message;
	}
	
//	@PostConstruct
	public void init()
	{
		System.out.println("Bean is going through init.");
	}
	
//	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean will destroy now.");
	}
}
