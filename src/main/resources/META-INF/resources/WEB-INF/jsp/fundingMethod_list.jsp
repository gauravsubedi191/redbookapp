<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fuding-Method</title>
<link
	href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2>Funding Methods</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Funding Method Code</th>
					<th>Funding Method Source</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${fundingMethods}" var="fundingMethod">
					<tr>
						<td>${fundingMethod.funding_method_id}</td>
						<td>${fundingMethod.funding_method_code}</td>
						<td>${fundingMethod.funding_method_source }</td>
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
</html>