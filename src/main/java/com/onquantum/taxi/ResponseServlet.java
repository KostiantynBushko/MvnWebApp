package com.onquantum.taxi;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by User on 26.07.14.
 */
public class ResponseServlet implements Servlet {
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
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Response servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<b>ResponseServlet</b>");
        out.println("<br>");
        out.println("<br>Server port = " + servletRequest.getServerPort());
        out.println("<br>Server name = " + servletRequest.getServerName());
        out.println("<br>Protocol = " + servletRequest.getProtocol());
        out.println("<br>Character encoding = " + servletRequest.getCharacterEncoding());
        out.println("<br>Content type = " + servletRequest.getContentType());
        out.println("<br>Content length = " + servletRequest.getContentLength());
        out.println("<br>Remote host = " + servletRequest.getRemoteHost());
        out.println("<br>Remote address = " + servletRequest.getRemoteAddr());
        out.println("<br>Schema = " + servletRequest.getScheme());

        out.println("<br>");
        out.println("<br>");
        out.println("<b><i>Parameters</i></b>");
        Enumeration parameters = servletRequest.getParameterNames();
        while(parameters.hasMoreElements()) {
            String parameter = (String)parameters.nextElement();
            out.println("<br>Parameter name = " + parameter);
            out.println("<br>Parameter value = " + servletRequest.getParameter(parameter));
        }

        out.println("<br>");
        out.println("<br>");
        out.println("<b><i>Attributes</i></b>");
        Enumeration attributes = servletRequest.getAttributeNames();
        while(attributes.hasMoreElements()) {
            String attribute = (String)attributes.nextElement();
            out.println("<br>Attribute name = " + attribute);
            out.println("<br>Attribute value = " + servletRequest.getAttribute(attribute));
        }

        out.println("</body>");
        out.println("</html>");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
