package com.onquantum.taxi;

/**
 * Created by User on 22.07.14.
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {

    private static int count = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        count++;
        request.setAttribute("current_count", count);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
