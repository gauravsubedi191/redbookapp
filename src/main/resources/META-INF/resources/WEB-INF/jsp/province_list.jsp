<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Province_List</title>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
		<a class="navbar-brand m-1" href="/">RBMS</a>
		<div class="collapse navbar-collapse">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/budget/list">Budget
						List</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/fiscalYear-list">Fiscal Year</a></li>
				<li class="nav-item"><a class="nav-link" href="/province-list">Province
						List</a></li>
				<li class="nav-item"><a class="nav-link" href="/ministry-list">Ministry
						List</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/economicCode-list">Economic Codes List</a></li>
				<li class="nav-item"><a class="nav-link" href="/">Donor
						Fund List</a></li>
				<li class="nav-item"><a class="nav-link" href="/">Government
						Fund List</a></li>

			</ul>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
		</ul>
	</nav>
	<div class="container">
		<h2>Province List</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Province Code</th>
					<th>Province English</th>
					<th>Province Nepali</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${provinces}" var="province">
					<tr>
						<td>${province.province_id}</td>
						<td>${province.province_code}</td>
						<td>${province.province_eng }</td>
						<td>${province.province_np }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script
	src="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/webjars/jquery/3.7.1/jquery.min.js"></script>
</html>