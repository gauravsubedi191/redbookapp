<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Welcome-page</title>

</head>
<body>
	<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
		<a class="navbar-brand m-1" href="/">RBMS</a>
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">

			</ul>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link"
				href="/budget/add-budget-form">Log Out</a></li>
		</ul>
	</nav>
	<h2 align="center">Welcome to Red Book Management System
		${username}!</h2>
	<a class="btn btn-success" href="/budget/list"
		style="display: block; width: fit-content; margin: 0 auto;">Go to
		Budget List</a>
</body>
<script
	src="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/webjars/jquery/3.7.1/jquery.min.js"></script>
</html>