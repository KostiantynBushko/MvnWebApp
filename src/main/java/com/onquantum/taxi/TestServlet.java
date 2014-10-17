package com.onquantum.taxi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 25.07.14.
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<HTML>");
        printWriter.println("<HEAD>");
        printWriter.println("<TITLE>Test Servlet</TITLE>");
        printWriter.println("</HEAD>");
        printWriter.println("<BODY>");
        printWriter.println("Welcome to the Test servlet");
        printWriter.println("</BODY>");
        printWriter.println("</HTML>");
    }
}
