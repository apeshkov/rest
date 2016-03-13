package org.sandbox.config;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Александр on 29.01.2016.
 */
@Order(Integer.MIN_VALUE)
public class AppInitializer implements WebApplicationInitializer {

    private static final String PAR_NAME_CTX_CONFIG_LOCATION = "contextConfigLocation";

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(ApplicationContext.class);

        servletContext.setInitParameter("contextConfigLocation", "");
        servletContext.addListener(new ContextLoaderListener(appContext));

        final ServletContainer servlet = new ServletContainer();
        final ServletRegistration.Dynamic appServlet = servletContext.addServlet("appServlet", servlet);
        appServlet.setInitParameter("jersey.config.server.provider.packages", "org.sandbox.resources");
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping("/*");
    }
}
