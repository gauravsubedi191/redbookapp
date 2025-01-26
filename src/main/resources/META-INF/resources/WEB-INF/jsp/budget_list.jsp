<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Budget-List</title>
<link
	href="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">

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
				<li class="nav-item"><a class="nav-link" href="/donor-list">Donor
						List</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/fundingMethod-list">Funding Method</a></li>

			</ul>
		</div>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
		</ul>
	</nav>
	<div class="container">
		<h2>Budget List</h2>
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Fiscal Year</th>
					<th>Province</th>
					<th>Ministry</th>
					<th>Economic Code</th>
					<th>Donors</th>
					<th>Funding Method</th>
					<th>Budget Amount</th>
					<th>Expenditure Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${budgets}" var="budget">
					<tr>
						<td>${budget.budget_id}</td>
						<td>${budget.fiscalYear.fiscal_year_id}</td>
						<td>${budget.province.province_id}</td>
						<td>${budget.ministry.ministry_id}</td>
						<td>${budget.economicCode.economic_id}</td>
						<td>${budget.donor.donor_id}</td>
						<td>${budget.fundingMethod.funding_method_id}</td>
						<td>${budget.budget_amount}</td>
						<td>${budget.expenditure_amount}</td>
						<td><a href="/budget/update/${budget.budget_id}"
							${budget.budget_id}"
							class="btn btn-info">Update</a> <a
							href="/budget/delete/${budget.budget_id}" class="btn btn-warning">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/budget/add-budget-form" class="btn btn-success">Add
			Budget</a>
	</div>
</body>
<script
	src="${pageContext.request.contextPath}/webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/webjars/jquery/3.7.1/jquery.min.js"></script>
</html>
