<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Budget Input Form</title>

<!-- Include Select2 CSS for searchable dropdowns -->
<link
	href="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css"
	rel="stylesheet" />

<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background-color: #f4f7f6;
	color: #333;
	padding: 20px;
	margin: 0;
}

form {
	max-width: 600px;
	margin: auto;
	background-color: white;
	padding: 25px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
	color: #2c3e50;
	margin-bottom: 20px;
	font-size: 1.8em;
	font-weight: 600;
}

label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
	font-size: 0.9em;
	color: #34495e;
}

input[type="number"], select {
	width: 100%;
	padding: 10px;
	margin-bottom: 20px;
	border: 1px solid #bdc3c7;
	border-radius: 5px;
	font-size: 0.9em;
	box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.1);
	transition: border 0.3s ease;
}

input[type="number"]:focus, select:focus {
	border-color: #3498db;
	outline: none;
	box-shadow: 0 0 5px rgba(52, 152, 219, 0.5);
}

input[type="submit"] {
	background-color: #3498db;
	color: white;
	font-size: 1em;
	font-weight: bold;
	padding: 10px;
	border: none;
	border-radius: 5px;
	width: 100%;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
	background-color: #2980b9;
}

.hidden {
	display: none;
}
</style>

</head>
<body>
	<nav>
		<h2>Budget Input Form</h2>
	</nav>
	<form:form id="budgetForm" action="/budget/save" method="post">

		<!-- <select id="budget_id" name="budget_id" style= "display:none"  >
		</select> -->
		<input type="hidden" name="budget_id"
			value="${budget.budget_id != null ? budget.budget_id :'0'}">

		<!-- Fiscal Year ID -->
		<label for="fiscal_year_id">Fiscal Year</label>
		<select id="fiscal_year_id" name="fiscal_year_id" class="searchable"
			required>
			<option value="" disabled selected>Select Fiscal Year</option>
			<c:forEach items="${fiscalYears}" var="fiscalYear">
				<option value="${fiscalYear.fiscal_year_id}"
					${fiscalYear.fiscal_year_id == budget.fiscal_year_id ? 'selected':''}>${fiscalYear.year}</option>
			</c:forEach>
		</select>
		<br>
		<br>

		<!-- Province -->
		<label for="province_id">Province:</label>
		<select id="province_id" name="province_id" class="searchable">
			<option value="" disabled selected>Select Province</option>
			<c:forEach items="${provinces}" var="province">
				<option value="${province.province_id}"
					${province.province_id == budget.province_id ? 'selected' :''}>${province.province_eng}</option>
			</c:forEach>
		</select>
		<br>
		<br>


		<!-- Minstry -->
		<label for="ministry_id">Ministry:</label>
		<select id="ministry_id" name="ministry_id" class="searchable">
			<option value="" disabled selected>Select Ministry</option>
			<c:forEach items="${ministries}" var="ministry">
				<option value="${ministry.ministry_id}"
					${ministry.ministry_id == budget.ministry_id ? 'selected' : ''}>${ministry.ministry_eng}
				</option>
			</c:forEach>
		</select>
		<br>
		<br>

		<!-- Economic Category -->
		<label for="economic_id">Economic Category:</label>
		<select id="economic_id" name="economic_id" class="searchable">
			<option value="" disabled selected>Select Economic Category</option>
			<c:forEach items="${economicCodes}" var="economicCode">
				<option value="${economicCode.economic_id}"
					${economicCode.economic_id == budget.economic_id ? 'selected' : ''}>${economicCode.economic_name}</option>
			</c:forEach>
		</select>
		<br>
		<br>

		<!-- Donor Fund -->
		<label for="donor_id">Donor Fund:</label>
		<select id="donor_id" name="donor_id" class="searchable">
			<option value="" disabled selected>Select Donor Fund</option>
			<c:forEach items="${donors}" var="donorFund">
				<option value="${donorFund.donor_id}"
					${donorFund.donor_id == budget.donor_id ? 'selected' : ''}>${donorFund.donor_source}</option>
			</c:forEach>
		</select>
		<br>
		<br>

		<!-- Funding Method -->
		<label for="funding_method_id">Funding Method:</label>
		<select id="funding_method_id" name="funding_method_id"
			class="searchable">
			<option value="" disabled selected>Select Funding Method</option>
			<c:forEach items="${fundingMethods}" var="fundingMethod">
				<option value="${fundingMethod.funding_method_id}"
					${fundingMethod.funding_method_id == budget.funding_method_id ? 'selected' : ''}>${fundingMethod.funding_method_source}
				</option>
			</c:forEach>
		</select>
		<br>
		<br>

		<!-- Budget Amount -->
		<label for="budgetAmount">Budget Amount:</label>
		<input type="number" id="budgetAmount" name="budget_amount"
			value="${budget.budget_amount}" step="0.01" required>
		<br>
		<br>

		<!-- Expenditure Amount -->
		<label for="expenditure_amount">Expenditure Amount:</label>
		<input type="number" id="expenditure_amount" name="expenditure_amount"
			value="${budget.expenditure_amount}" step="0.01" required>
		<br>
		<br>

		<!-- Submit Button -->
		<input type="submit" value="Submit">
	</form:form>

	<!-- Select2 JS for searchable drop downs -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js"></script>

	<script>
		// Activate Select2 on all dropdowns with the 'searchable' class
		$(document).ready(function() {
			$('.searchable').select2();
		});
	</script>

</body>
</html>
