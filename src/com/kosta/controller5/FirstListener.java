package com.kosta.controller5;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class FirstListener
 *
 */
@WebListener
public class FirstListener implements ServletContextListener {

    
    public FirstListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("FirstListener contextDestroyed ");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 

    System.out.println("FirstListener contextInitialized ");
    }
	
}
