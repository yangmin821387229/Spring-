package com.tutorialspoint;

public class HelloWorld {
//	private String message;
//
//	public void getMessage() {
//		System.out.println("Your Message:"+message);
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//	
//	public void init() {
//		System.out.println("Bean is going through init.");
//	}
//	
//	public void destroy() {
//		System.out.println("Bean will destroy now.");
//	}
	
	private String message1;
	private String message2;
	public void getMessage1() {
		System.out.println("World Message2:"+message2);
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public void getMessage2() {
		System.out.println("World Message1:"+message1);
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
	
}
