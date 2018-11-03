package myPackage;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex9_3
 */
@WebServlet("/ex9_3")
public class ex9_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String engine = request.getParameter("engine");
		String query = request.getParameter("query");
		if ((engine != null) && (query != null) && (query.trim().length() > 0)) {
			String url = "";
			switch (engine) {
			case "naver":
				url = "http://search.naver.com/search.naver?query=" + query;
				break;
			case "daum":
				url = "http://search.daum.net/search?q=" + query;
				break;
			case "google":
				url = "http://www.google.com/search?q=" + query;
				break;
			case "yahoo":
				url = "http://search.yahoo.com/search?p=" + query;
				break;
			case "bing":
				url = "http://www.bing.com/search?q=" + query;
				break;
			}
			response.sendRedirect(url);
			return;
		}
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\n" + "<head><title>Exercise9.3</title>\n"
				+ "<style>body{font-family: times;}</style></head>\n"
				+ "<body><h1 align='center'>Search Front-end</h1>"
				+ "<div align='center'>"
				+ "<form action='ex9_3'>"
				+ "<h4>Choose a search engine and enter query keywords.</h4>");
		out.print("<select name='engine' style='margin-right: 10px'><option value='naver'>Naver</option>" + "<option value='daum'>Daum</option>"
				+ "<option value='google'>Google</option>" + "<option value='yahoo'>Yahoo</option>"
				+ "<option value='bing'>Bing</option></select>");
		out.println("<input type='text' name='query' style='width: 240px'/><br>");
		out.println("<p><input type='submit' value='Search'/></p></form></div>");
		out.println("</body></html>");
	}
}
