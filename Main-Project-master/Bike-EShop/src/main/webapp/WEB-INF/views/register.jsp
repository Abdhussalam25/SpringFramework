<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="header.jsp"%>

<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/style.css">

<style>
.jumbotron {
	margin-bottom: 0px; ! important;
	background-color: aqua;
	height: 20%;
}
.nav {
  float:right!important;
  margin:0px;
}
.form-group {
	float: left;
	width: 500px;
	padding: 10px;
	margin: 10px;
	text-align: left;
}

.fullform {
	float: right;
	width: 500px;
	margin: 10px;
	padding: 10px;
}

.cb {
	clear: both;
}

.Register {
	float: center;
}

.Register:hover {
	background-color: #0d89d2;
	text-align: center;
	cursor: pointer;
}
</style>

</head>
<body>

	<div class="container-wrapper">
		<div class="container">

			<c:url var="url" value="/all/registercustomer"></c:url>

			<form:form action="${url }" commandName="customer">

				<div class="form-group">
					<form:label path="firstName">FIRST NAME</form:label>
					<form:input path="firstName" class="fullform"></form:input>
					<form:errors path="firstName"></form:errors>
				</div>

				<div class="form-group">
					<form:label path="lastName">LAST NAME</form:label>
					<form:input path="lastName" class="fullform"></form:input>
					<form:errors path="lastName"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="email">EMAIL</form:label>
					<form:input path="email" class="fullform"></form:input>
					<form:errors path="email"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="phoneNumber">PHONE NUMBER</form:label>
					<form:input path="phoneNumber" class="fullform"></form:input>
					<form:errors path="phoneNumber"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="users.userName">USERNAME</form:label>
					<form:input path="users.userName" class="fullform"></form:input>
					${duplicateUserName}
					<form:errors path="users.userName"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="users.passWord">PASSWORD</form:label>
					<form:input path="users.passWord" type="password" class="fullform"></form:input>
					<form:errors path="users.passWord"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="billingAddress.apartmentNumber">APARTMENT NUMBER</form:label>
					<form:input path="billingAddress.apartmentNumber" class="fullform"></form:input>
					<form:errors path="billingAddress.apartmentNumber"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="billingAddress.streetName">STREET NAME</form:label>
					<form:input path="billingAddress.streetName" class="fullform"></form:input>
					<form:errors path="billingAddress.streetName"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="billingAddress.city">CITY</form:label>
					<form:input path="billingAddress.city" class="fullform"></form:input>
					<form:errors path="billingAddress.city"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="billingAddress.state">STATE</form:label>
					<form:input path="billingAddress.state" class="fullform"></form:input>
					<form:errors path="billingAddress.state"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="billingAddress.country">COUNTRY</form:label>
					<form:input path="billingAddress.country" class="fullform"></form:input>
					<form:errors path="billingAddress.country"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="billingAddress.zipCode">ZIPCODE</form:label>
					<form:input path="billingAddress.zipCode" class="fullform"></form:input>
					<form:errors path="billingAddress.zipCode"></form:errors>


				</div>

				<div class="form-group">
					<form:label path="shippingAddress.apartmentNumber">APARTMENT NUMBER</form:label>
					<form:input path="shippingAddress.apartmentNumber" class="fullform"></form:input>
					<form:errors path="shippingAddress.apartmentNumber"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="shippingAddress.streetName">STREET NAME</form:label>
					<form:input path="shippingAddress.streetName" class="fullform"></form:input>
					<form:errors path="shippingAddress.streetName"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="shippingAddress.city">CITY</form:label>
					<form:input path="shippingAddress.city" class="fullform"></form:input>
					<form:errors path="shippingAddress.city"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="shippingAddress.state">STATE</form:label>
					<form:input path="shippingAddress.state" class="fullform"></form:input>
					<form:errors path="shippingAddress.state"></form:errors>
				</div>
				<div class="form-group">
					<form:label path="shippingAddress.country">COUNTRY</form:label>
					<form:input path="shippingAddress.country" class="fullform"></form:input>
					<form:errors path="shippingAddress.country"></form:errors>

				</div>
				<div class="form-group">
					<form:label path="shippingAddress.zipCode">ZIPCODE</form:label>
					<form:input path="shippingAddress.zipCode" class="fullform"></form:input>
					<form:errors path="shippingAddress.zipCode"></form:errors>
				</div>

				<div class=cb></div>

				<input type="submit" value="Register" class="Register"
					style="align: center;">

			</form:form>


		</div>

	</div>
</body>
</html>