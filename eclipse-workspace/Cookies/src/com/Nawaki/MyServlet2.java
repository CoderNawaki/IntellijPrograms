package com.Nawaki;

import java.io.PrintWriter;

import javax.servlet.http.*;

public class MyServlet2 extends HttpServlet
{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter= response.getWriter();
			
			//Reading cookies
			Cookie[] c = request.getCookies();
			//Displaying user name value from cookie
			pwriter.print("Name here:"+c[0].getValue());
			pwriter.print("Password:"+c[1].getValue());
			pwriter.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
