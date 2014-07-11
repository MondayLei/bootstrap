package com.monday.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.monday.web.model.Greeting;

public class RequestServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)

	throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		writer.println("Hello World! Welcome Monday!");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config/applicationContext.xml");
		Greeting greeting = (Greeting) context.getBean("helloBean");
		writer.println(greeting.getId());
	}
}