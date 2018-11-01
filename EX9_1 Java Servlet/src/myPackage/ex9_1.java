package myPackage;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex9_1")
public class ex9_1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String field[] = {"First name", "Last name", "E-mail", "Phone number"};
		String param[] = {"firstname","lastname","email","tel"};
		
		out.println("<!DOCTYPE html>\n" 
		+ "<html>\n" 
		+ "<head><title>EX9-1</title><style>span{color: red;}</style></head>\n" 
		+"<body><h2>Registration</h2>\n"
		+ "<form><table>");
		for (int i = 0; i < field.length; i ++) {
            out.print("<tr><td><label>" + field[i] + ": </label></td>" +
                 "<td><input type=\"text\" name=\"" + param[i] + "\"");
            String val = request.getParameter(param[i]);
            String msg = (val != null && val.length() <= 0) ? 
                 ("<td><span>Enter " + field[i] + "</span><td>") : ("");
            out.print((val == null) ? ("/></td>") : (" value=\"" + val + "\"></td>" + msg));
            out.println("</tr>");
        }
		out.println("<tr><td><input type='submit' value='Register'>"+
		"</td></tr></table></form></body></html>"); 
	}
}