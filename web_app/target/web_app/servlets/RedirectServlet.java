package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchTerm = request.getParameter("search");
        
        // Redirecting to Google with the search term as a query parameter
        String googleSearchUrl = "https://www.google.com/search?q=" + searchTerm;
        response.sendRedirect(googleSearchUrl);
    }
}

