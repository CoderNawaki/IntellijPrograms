package Nawaki;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String user = req.getParameter("UserName");
		String pass = req.getParameter("UserPassword");
		//pw.println("Login success ......!");
		
		if(user.equals("Nawaki")&& pass.equals("Nawaki"))
			pw.println("Login success....!");
		else
			pw.println("Login failed");
		pw.close();
	}
}
