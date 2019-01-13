package com.tutorialspoint;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
       
       log.info("Going to create HelloWorld Obj");
       HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
       obj.getMessage();
       log.info("Exiting the program");
       
    }
}
