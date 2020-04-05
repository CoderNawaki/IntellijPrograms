package Nawaki;
import java.io.*;
import javax.servlet.*;
public class Simple extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)
	throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter pwriter = res.getWriter();
		pwriter.print("<html>");
		pwriter.println("<body>");
		pwriter.println("<h2>Generic Servlet Example practice");
		pwriter.println("Welcome to the simple example");
		pwriter.print("</body>");
		pwriter.print("</html>");
	}
}
