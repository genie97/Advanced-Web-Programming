<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Web Spring: Invalid ID</title>
<style>
body {
	font-family: times;
}
</style>
</head>
<body text="${colorPreferences.foreground}"
	bgcolor="${colorPreferences.background}">
	<H2>Spring Bank: Error</H2>
	<p>Unknown Customer ID: ${id}</p>
</body>
</html>