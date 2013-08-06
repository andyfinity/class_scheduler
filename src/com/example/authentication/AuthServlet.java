package com.example.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.expressme.openid.*;

public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AuthServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        if(request.getParameter("openid.mode") == null) {
            OpenIdManager man = new OpenIdManager();
            man.setReturnTo("http://localhost:8080/class_scheduler/auth");
            man.setRealm("http://localhost:8080");
            
            Endpoint end = man.lookupEndpoint("Google");
            Association assoc = man.lookupAssociation(end);
            String url = man.getAuthenticationUrl(end, assoc);
            response.sendRedirect(url);
        }
        else {
        	String identity = (String) request.getAttribute("openid.identity");
        	String email = (String) request.getAttribute("openid.ext1.value.email");
        	String firstname = (String) request.getAttribute("openid.ext1.value.firstname");
        	String lastname = (String) request.getAttribute("openid.ext1.value.lastname");
        	User u = new User(identity, firstname, lastname, email);
        	session.setAttribute("user", u);
            response.sendRedirect("http://localhost:8080/class_scheduler/index.jsp");
        }

        out.close();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
