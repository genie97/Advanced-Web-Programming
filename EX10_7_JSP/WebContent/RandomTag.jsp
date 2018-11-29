<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- JAVA-BASED: random (double) -->
	<p>Java-based: Random number (double)</p>
	<%@ taglib uri="/WEB-INF/myjsp-randomtaglib.tld" prefix="JAVABASED"%>
	<JAVABASED:random />
	<br />
	<JAVABASED:random />
	<br />
	<JAVABASED:random />
	<br />
	<JAVABASED:random />
	<br />
	<JAVABASED:random />
	<br />

	<!-- JAVA-BASED: random (integer) -->
	<p>Java-based: Random integer</p>
	<JAVABASED:randomInteger limit="20" />
	<br />
	<JAVABASED:randomInteger limit="100" />
	<br />
	<JAVABASED:randomInteger limit="40" />
	<br />
	<JAVABASED:randomInteger limit="2" />
	<br />
	<JAVABASED:randomInteger />
	<br />


	<!-- Using tags: random (double) -->
	<p>Using tags: Random number (double)</p>
	<%@ taglib tagdir="/WEB-INF/tags" prefix="JSPBASED"%>
	<JSPBASED:random />
	<br />
	<JSPBASED:random />
	<br />
	<JSPBASED:random />
	<br />
	<JSPBASED:random />
	<br />
	<JSPBASED:random />
	<br />

	<!-- Using tags: random (integer) -->
	<p>Using tags: Random integer</p>
	<JSPBASED:randomInteger limit="20" />
	<br />
	<JSPBASED:randomInteger limit="100" />
	<br />
	<JSPBASED:randomInteger limit="40" />
	<br />
	<JSPBASED:randomInteger limit="2" />
	<br />
	<JSPBASED:randomInteger />
	<br />
</body>
</html>