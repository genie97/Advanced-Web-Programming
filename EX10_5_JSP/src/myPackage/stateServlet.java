package myPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class stateServlet
 */
@WebServlet("/stateServlet")
public class stateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String stateName = request.getParameter("stateName");
		stateLookup service = new stateLookup();
		StatePair statePair = service.findState(stateName);
		request.setAttribute("statePair", statePair);

		String address;
		if (statePair == null) {
			if (stateName == "") {
				request.setAttribute("unknownState", "No State Name");
			} else {
				request.setAttribute("unknownState", stateName);
			}
			address = "Error.jsp";
		} else {
			address = "Success.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}
}
