package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		System.out.println("-----------------Records Creation----------------------");
		studentJDBCTemplate.create("Zara", 11);
		studentJDBCTemplate.create("Nuha", 2);
		studentJDBCTemplate.create("Ayan", 15);
		System.out.println("-------------------------------Listing Multiple Records---------------------");
		List<Student> students = studentJDBCTemplate.listStudents();

		for (Student student : students) {
			System.out.println("ID:"+ student.getId());
			System.out.println(",Name:"+ student.getName());
			System.out.println(",Age:"+ student.getAge());
		}
		
		System.out.println("------------------Updating Record With ID = 2---------------------------------");
		studentJDBCTemplate.update(2, 20);
		System.out.println("------------------Listing Record With ID = 2-------------------------------------");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.println("ID:"+ student.getId());
		System.out.println(",Name:"+ student.getName());
		System.out.println(",Age:"+ student.getAge());
	}
}
