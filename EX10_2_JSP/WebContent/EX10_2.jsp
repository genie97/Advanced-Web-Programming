<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EX10-2</title>
</head>
<%
	String bgColor, textColor;
	if (request.getHeader("User-Agent").contains("Chrome")) {
		bgColor = "yellow";
		textColor = "red";
	} else {
		bgColor = "navy";
		textColor = "white";
	}
%>
<body bgColor="<%=bgColor%>" text="<%=textColor%>">
	<%@ page import="java.util.*"%>
	<%
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String name = (String) headerNames.nextElement();
			String cname = name.substring(0, 1).toUpperCase() + name.substring(1);
	%>
	<p><%=cname%>
		:
		<%=request.getHeader(name)%></p>
	<%
		}
	%>
</body>
</html>