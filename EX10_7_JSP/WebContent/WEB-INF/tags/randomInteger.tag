<%@ tag language="java" pageEncoding="EUC-KR"%>
<%@ attribute name="limit" required="false"%>
<%
	int randLimit = 10;
	try {
		randLimit = Integer.parseInt(limit);
	} catch (NumberFormatException e) {
		randLimit = 10;
	}
%>
<%=(new java.util.Random().nextInt(randLimit))%>