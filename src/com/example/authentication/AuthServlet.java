package com.example.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
    	out.println("<p>doGet</p>");
        
        if(request.getParameter("logout") != null) {
        	session.setAttribute("user", null);
        	out.println("<p>You've been logged out!</p>");
        }
    	
    	if(session.getAttribute("user") != null) {
    		User u = (User) session.getAttribute("user");
    		out.println("<p>You're logged in!</p><p>" + u.username + ":" + u.password + "</p>");
    	}
    	else {
    		out.println("<form action=\"auth\" method=\"POST\"><p>Username: <input type=\"text\" name=\"username\" /></p><p>Password: <input type=\"password\" name=\"password\" /></p><p><input type=\"submit\" value=\"Submit\" /></p></form>");
    	}
        out.close();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
    	out.println("<p>doPost</p>");
    	
    	if(session.getAttribute("user") != null) {
    		out.println("<p>You're already logged in!</p>");
    	}
    	else {
        	String username = request.getParameter("username");
        	String password = request.getParameter("password");
            out.println("<p>You've been logged in!</p><p>Username: " + username + "</p><p>Password: " + password + "</p>");
            User u = new User(username, password);
            session.setAttribute("user", u);
        }
        out.close();
	}
}
