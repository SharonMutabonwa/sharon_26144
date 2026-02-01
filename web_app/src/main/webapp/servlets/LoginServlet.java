package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        if (password.length() < 8) {
            out.println("<h2>Hello " + username + ", your password is weak. Try a strong one.</h2>");
        } else {
            out.println("<h2>Welcome " + username + "</h2>");
        }
    }
}

