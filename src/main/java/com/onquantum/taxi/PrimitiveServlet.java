package com.onquantum.taxi;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by User on 25.07.14.
 */
public class PrimitiveServlet implements Servlet {

    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("primitive : init");
        this.servletConfig = servletConfig;

        Enumeration parameters = this.servletConfig.getInitParameterNames();
        while (parameters.hasMoreElements()) {
            String parameter  = (String)parameters.nextElement();
            System.out.println("Parameter name  = " + parameter);
            System.out.println("Parameter value = " + servletConfig.getInitParameter(parameter));
        }

        ServletContext servletContext = servletConfig.getServletContext();
        /*Enumeration attributes = servletContext.getAttributeNames();
        while(attributes.hasMoreElements()) {
            String attribute = (String)attributes.nextElement();
            System.out.println("Attribute name  = " + attribute);
            System.out.println("Attribute value = " + servletContext.getAttribute(attribute));
        }*/

        System.out.println("Major version = " + servletContext.getMajorVersion());
        System.out.println("Minor version = " + servletContext.getMinorVersion());
        System.out.println("Server info   = " + servletContext.getServerInfo());
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("primitive: service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("primitive : destroy");
    }
}
