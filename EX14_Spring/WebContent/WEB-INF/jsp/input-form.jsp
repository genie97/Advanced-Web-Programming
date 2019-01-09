<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Web Spring: Bank Customer Lookup</title>
<style>
body {
	font-family: times;
}

label {
	float: left;
	width: 70pt;
}
</style>
</head>
<body text="${colorPreferences.foreground}"
	bgcolor="${colorPreferences.background}">
	<H2>Spring Bank</H2>
	<form action="get-customer" method="post">
		<label>Customer ID: </label><input type="text" name="cust-id" /><br />
		<label>Password: </label><input type="password" name="password" /><br />
		<label>Foreground: </label><input type="text" name="fgcolor"
			value="${colorPreferences.foreground}" /><br /> <label>Background:
		</label><input type="text" name="bgcolor"
			value="${colorPreferences.background}" />
		<p />
		<input type="submit" value="Show Balance" />
	</form>
</body>
</html>