package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model2;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
	
		Model2 m=new Model2();
		m.setName(name);
		m.setId(id);
		m.setPwd(pwd);
		
	
	boolean status=m.register();
	if(status==true)
	{
		response.sendRedirect("/MVC2/registerSuccess.jsp");
		
	}
	else
	{
		response.sendRedirect("/MVC2/registerFailed.jsp");
	}
	}

}
