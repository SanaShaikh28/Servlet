package com.bridgelabz.servletListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	private ServletContext context;

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {

		System.out.println("Context Initialized");
		// get servlet context
		context = servletContextEvent.getServletContext();
		// set attribute in context
		String attributeValue = "Context Param Value";
		String attributeName = "ContextParam";
		context.setAttribute(attributeName, attributeValue);
	}

	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("Project not deployed..");
	}

}
