package com.onquantum.taxi;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by User on 26.07.14.
 */
public class UserRegistrationServlet extends HttpServlet {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_test";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "9999";


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>User registration</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<b><i>Do Get User registration servlet</i></b>");
        printWriter.println("<form method=post>");
        printWriter.println("<br>Name   :<input type=text name=Name>");
        printWriter.println("<br>Surname:<input type=text name=Surname>");
        printWriter.println("<br>Email  :<input type=text name=Email>");
        printWriter.println("<br>Phone  :<input type=text name=Phone>");
        printWriter.println("<br><input type=submit name=submit value=Registered>");
        printWriter.println("</form>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        String Name = request.getParameter("Name");
        String Surname = request.getParameter("Surname");
        String Email = request.getParameter("Email");
        String Phone = request.getParameter("Phone");
        String created = Long.toString(System.currentTimeMillis() / 1000L);
        String update = Long.toString(System.currentTimeMillis() / 1000L);

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>User registered</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<b><i>Thanks for registration</i><b>");
        printWriter.println("<br>Name : " + request.getParameter("Name"));
        printWriter.println("<br>Surname : " + request.getParameter("Surname"));
        printWriter.println("<br>Email : " + request.getParameter("Email"));
        printWriter.println("<br>Phone : " + request.getParameter("Phone"));
        printWriter.println("</body>");
        printWriter.println("</html>");

        Statement statement = null;
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
            statement = connection.createStatement();
            String sql = "INSERT INTO tb_user (name,surname,email,phone,create_time,update_time)"
                    + " VALUES ('" + Name + "','" + Surname + "','" + Phone + "','"
                    + Email + "','" + created + "','" + update + "');";
            System.out.println("*********************************************************");
            System.out.println(sql);
            System.out.println("*********************************************************");
            statement.executeUpdate(sql);
            statement.close();
        }catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }catch (SQLException e2){
            e2.printStackTrace();
        }finally {
            if(statement != null)
                statement = null;
        }
    }
}
