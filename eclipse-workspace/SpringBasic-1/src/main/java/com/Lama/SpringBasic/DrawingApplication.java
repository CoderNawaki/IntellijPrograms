package com.Lama.SpringBasic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String args[]) {
		//Triangle triangle = new  Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//this is big brother of bean factory
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}
}
