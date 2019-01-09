<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Web Spring: Show Customer</title>
<style>
body {
	font-family: times;
}
</style>
</head>
<body text="${colorPreferences.foreground}"
	bgcolor="${colorPreferences.background}">
	<H2>Spring Bank: Show Customer</H2>
	<ul>
		<li>ID: ${customer.customerID}</li>
		<li>Name: ${customer.name}</li>
		<li>Balance: ${customer.formattedBalance}</li>
	</ul>
</body>
</html>