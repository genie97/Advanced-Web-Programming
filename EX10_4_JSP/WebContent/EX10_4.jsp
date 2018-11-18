<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Exercise 10.4</title>
<style>
body {
	font-family: times;
}
</style>
</head>
<body>
	<H1>HTTP Request Headers</H1>
	<jsp:useBean id="requestHeader" class="myPackage.RequestHeader" scope="application" />
	<%
		Enumeration<String> headerNames = request.getHeaderNames();
		Map<String, String> headerMap = new HashMap<String, String>();

		while (headerNames.hasMoreElements()) {
			String name = (String) headerNames.nextElement();
			headerMap.put(name, request.getHeader(name));
		}
	%>
	<%
		String browser = request.getParameter("browser");
		boolean firstBrowser = (browser == null || browser.equals("First Browser"));
		boolean secondBrowser = (browser != null && browser.equals("Second Browser"));

		if (firstBrowser) {
			requestHeader.setHost(headerMap.get("host"));
			requestHeader.setConnection(headerMap.get("connection"));
			requestHeader.setAccept(headerMap.get("accept"));
			requestHeader.setAcceptEncoding(headerMap.get("accept-encoding"));
			requestHeader.setCacheControl(headerMap.get("cache-control"));
			requestHeader.setUaCpu(headerMap.get("ua-cpu"));
			requestHeader.setUserAgent(headerMap.get("user-agent"));
			requestHeader.setCookie(headerMap.get("cookie"));
			requestHeader.setAcceptLanguage(headerMap.get("accept-language"));
		}
	%>
	<table border=1 style="border-collapse:collapse;">
		<tr>
			<th>Header</th>
			<th>First Browser</th>
			<%=(secondBrowser) ? ("<th>Second Browser</th>") : ("")%>
		</tr>
		<tr>
			<td>Host:</td>
			<td><jsp:getProperty name="requestHeader" property="host" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("host") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Connection:</td>
			<td><jsp:getProperty name="requestHeader" property="connection" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("connection") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Accept:</td>
			<td><jsp:getProperty name="requestHeader" property="accept" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("accept") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Accept-encoding:</td>
			<td><jsp:getProperty name="requestHeader"
					property="acceptEncoding" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("accept-encoding") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Cache-control:</td>
			<td><jsp:getProperty name="requestHeader"
					property="cacheControl" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("cache-control") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Ua-cpu:</td>
			<td><jsp:getProperty name="requestHeader"
					property="uaCpu" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("ua-cpu") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>User-agent:</td>
			<td><jsp:getProperty name="requestHeader"
					property="userAgent" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("user-agent") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Cookie:</td>
			<td><jsp:getProperty name="requestHeader"
					property="cookie" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("cookie") + "</td>") : ("")%>
		</tr>
		<tr>
			<td>Accept-language:</td>
			<td><jsp:getProperty name="requestHeader"
					property="acceptLanguage" /></td>
			<%=(secondBrowser) ? ("<td>" + request.getHeader("accept-language") + "</td>") : ("")%>
		</tr>
	</table>
	<form action="EX10_4.jsp" method="get">
		<p>
			<input type="submit" name="browser" value="First Browser" />&nbsp;&nbsp;
			<input type="submit" name="browser" value="Second Browser" />
	</form>
</body>
</html>
