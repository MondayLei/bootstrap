package com.monday.web;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.monday.web.model.Greeting;

public class Main {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext:classpath
		// FileSystemXmlApplicationContext:working directory path
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"src/main/resources/config/configSpring.xml");
		BeanFactory factory = (BeanFactory) context;
		Greeting test = (Greeting) factory.getBean("helloBean");
		test.print();
	}
}