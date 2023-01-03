package com.vgherta.spring.rest.configuration;

import com.vgherta.spring.rest.configuration.MyConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitialiser extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MyConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
