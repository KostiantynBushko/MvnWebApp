package com.onquantum.taxi;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by User on 26.07.14.
 */
public class RequestServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter out = servletResponse.getWriter();

        System.out.println("Server port = " + servletRequest.getServerPort());
        System.out.println("Server name = " + servletRequest.getServerName());
        System.out.println("Protocol = " + servletRequest.getProtocol());
        System.out.println("Character encoding = " + servletRequest.getCharacterEncoding());
        System.out.println("Character encoding = " + servletRequest.getCharacterEncoding());

        System.out.println("Content type = " + servletRequest.getContentType());
        System.out.println("Content length = " + servletRequest.getContentLength());
        System.out.println("Remote address = " + servletRequest.getRemoteAddr());
        System.out.println("Remote host = " + servletRequest.getRemoteHost());
        System.out.println("Scheme = " + servletRequest.getScheme());

        Enumeration parameters = servletRequest.getParameterNames();
        while (parameters.hasMoreElements()) {
            String parameter = (String)parameters.nextElement();
            System.out.println("Parameter name = " + parameter);
            System.out.println("Parameter value = " + servletRequest.getParameter(parameter));
        }
        Enumeration attributes = servletRequest.getAttributeNames();
        while(attributes.hasMoreElements()) {
            String attribute = (String)attributes.nextElement();
            System.out.println("Attribute name = " + attribute);
            System.out.println("Attribute value = " + servletRequest.getAttribute(attribute));
        }

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
