package com.Nawaki;

import java.io.PrintWriter;

import javax.servlet.http.*;

public class MyServlet1 extends HttpServlet{
		public void doGet(HttpServletRequest request,HttpServletResponse response)
		{
			try {
				response.setContentType("text/html");
				PrintWriter pwriter = response.getWriter();
				
				String name = request.getParameter("userName");
				String password = request.getParameter("userPassword");
				pwriter.print("Hello there :"+name);
				pwriter.print("Your password is :"+password);
				
				//creating two cookies
				Cookie c1 = new Cookie("userName",name);
				Cookie c2 = new Cookie("userPassword",password);
				
				//Adding the cookies to response header
				response.addCookie(c1);
				response.addCookie(c2);
				
				pwriter.print("<br><a href='welcome to here'>view detail</a>");
				pwriter.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
}
