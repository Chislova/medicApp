package com.javaSchool.configuration;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


public class WebAppInitializer implements WebApplicationInitializer {

    private static final Logger log = LogManager.getLogger(WebAppInitializer.class);


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}