package myPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class CustomerLookupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		CustomerLookupService lookupService = (CustomerLookupService) context.getBean("customerLookupService");
		String id = request.getParameter("cust-id");
		String address;
		if (isEmpty(id)) {
			address = "missing.jsp";
		} else {
			Customer customer = lookupService.getCustomer(id);
			if (customer == null) {
				request.setAttribute("id", id);
				address = "invalid.jsp";
			} else {
				request.setAttribute("customer", customer);
				address = "show-customer.jsp";
			}
		}
		address = "/WEB-INF/jsp/" + address;
		ColorPreferences colorPreferences = (ColorPreferences) context.getBean("colorPreferences");
		colorPreferences.setForeground(request.getParameter("fgcolor"));
		colorPreferences.setBackground(request.getParameter("bgcolor"));

		RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		dispatcher.forward(request, response);
	}

	private boolean isEmpty(String param) {
		return ((param == null) || (param.trim().equals("")));
	}

}
