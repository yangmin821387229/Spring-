package com.tutorialspoint;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
//		obj.getMessage();	
		
		
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//		HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
//		obj.getMessage();
		
//		ApplicationContext context = new FileSystemXmlApplicationContext("E:\\Code\\HelloSpring1\\src\\Beans.xml");
//		HelloWorld obj1 = (HelloWorld)context.getBean("helloWorld");
//		obj1.getMessage();
//		HelloWorld obj2 = (HelloWorld)context.getBean("helloWorld");
//		System.out.println(obj1==obj2);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld)context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objB = (HelloIndia)context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
//		context.registerShutdownHook();
//		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
//		obj.getMessage();
//		ExampleBean2 obj = (ExampleBean2)context.getBean("exampleBean");
//		ExampleBean obj2 = (ExampleBean)context.getBean("exampleBean1");
	} 

}
