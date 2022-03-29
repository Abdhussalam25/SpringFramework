<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@include file="header.jsp"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bike-EShoplogin</title>
<style>
div.fulldocument {
	width: 100%;
	margin: 75px;
	padding: 12px;
	margin: 100px border: 1px solid #cccccc;
}

#requiredField.1 {
	padding: 36px 100px 36px 127px;
	font-size: 10px;
}

.loginForm {
	text-align: center;
}

input:fous {
	background-color: #ffffff;
}

input[type="text"] {
	background-color: #eeeeee;
	width: 300px;
	padding: 10px 20px
}

input[type="password"] {
	background-color: #eeeeee;
	width: 300px;
	padding: 10px 20px
}

.IN {
	float: left;
	width: 400px;
	padding: 20px 30px;
}

.cb {
	clear: both;
}

button[type="button"] {
	font-size: 20px;
	margin-top: 35px;
	padding: 12px 30px;
	border-width: 1px;
	background-color: white;
	font-size: 18px;
	background-color: #309ddc;
	color: #ffffff;
}

#Login {
	margin-left: 10px;
	width: 100px;
	height: 50px;
	padding: 10px;
	margin: 20px;
	text-align: center;
}

#Login:hover {
	background-color: #0d89d2;
	cursor: pointer;
}

.button {
	margin: 10px;
}

.alignment {
	text-align: center;
}
</style>

</head>

<body>
	<div class="fulldocument">


		<div class="alignment">

			<div class="alignment">

				<form name="loginForm" method="post"
					action=" <c:url value="/j_spring_security_check"> </c:url>">


					Enter UserName : <input type="text" name="j_username"
						placeholder="UserName" required>
			</div>

			<br>

			<div class="alignment">

				Enter Password : <input type="password" name="j_password"
					placeholder=" Password" required>
			</div>


			<div class="cb"></div>


			<div class="button">
				<input id="Login" type="submit" value="Login" />
			</div>

			<div id="errorMessage">${error }</div>
			<div id="logOutMessage">${logout}</div>
			<div id="registrationSuccessMessage">${registrationsuccess}</div>

			</form>

		</div>

	</div>
</body>
</html>