package com.monday.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)

	throws IOException, ServletException {

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		writer.println("Hello World!");
	}
}