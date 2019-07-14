package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model2;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
	
		Model2 m=new Model2();
		m.setName(name);
		m.setPwd(pwd);
	boolean status=m.login();
	if(status==true)
	{
		response.sendRedirect("/MVC2/loginSuccess.jsp");
		
	}
	else
	{
		response.sendRedirect("/MVC2/loginFailed.jsp");
	}
	}
}
		
		
		
