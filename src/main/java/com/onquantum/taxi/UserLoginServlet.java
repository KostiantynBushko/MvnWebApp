package com.onquantum.taxi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 27.07.14.
 */
public class UserLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        /*PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Login page</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<b><i>Login page</i></b>");
        printWriter.println("<br>Email :<input type=text name=Email>");
        printWriter.println("<br>Password :<input type=password name=Password>");
        printWriter.println("<br><input type=submit name=Login value=Login>");
        printWriter.println("</body>");
        printWriter.println("</html>");*/
        request.getRequestDispatcher("pages/login.html").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        String email = request.getParameter("Email");
        String password = request.getParameter("Password");

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Success login</title>");
        printWriter.println("");
    }
}
