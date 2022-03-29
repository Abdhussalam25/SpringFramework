<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bike-EShop</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      
       <!-- JQuery -->
    <script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
    

<link rel="stylesheet" href="resources/bootstrap1/css/bootstrap.min.css">
<script src="resources/bootstrap1/js/jquery-3.1.1.min.js"></script>
<script src="resources/bootstrap1/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

<link rel="stylesheet" href="resources/style.css">

	<link rel="stylesheet" type="text/css" href="http://cdn.webrupee.com/font">
    <script src=http://cdn.webrupee.com/js type=”text/javascript”></script>


</head>

<body>
<div id="navmar">
		<nav class="navbar navbar-inverse navbar-fixed-top opaque-navbar">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="home">Bike-EShop</a>
				</div>
				<ul class="nav navbar-nav">

					<li class="active"><a href="home">Home</a></li>

					<c:if test="${pageContext.request.userPrincipal.name ==null }">
						<li><a href="/Bike-EShop/all/registerationform">Register</a></li>
					</c:if>

					<!-- THIS ONE IS HIDE ADDPRODUCT BROWSEALL CATEGORY AND WELCOME MESSAGE FROM UNLOGGED USER-->



					<security:authorize access="hasRole('ROLE_ADMIN')">

						<c:url var="url5" value="/admin/product/productform"></c:url>
						<li><a href=${url5 }>Add Product</a>
					</security:authorize>

					<c:if test="${pageContext.request.userPrincipal.name!=null }">

						<li><a href="/Bike-EShop/all/product/getAllProducts">Browse
								all Product</a>
					 <security:authorize access="hasRole('ROLE_USER')">
						<li><a href="<c:url value="/cart/getCartId"></c:url>">Cart</a></li>
					</security:authorize>
					<!--  
						  	<li class="dropdown"><a href="" class="dropdown-toggle"
							data-toggle="dropdown"> Select by Category<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<c:url var="url1"
									value="/all/product/productsByCategory?searchCondition=New Arrival"></c:url>
								<li><a href="${url1}">New Arrivals</a></li>
								<c:url var="url2"
									value="/all/product/productsByCategory?searchCondition=Special"></c:url>
								<li><a href="${url2}">Special</a></li>

								<c:url var="url_3"
									value="/all/product/productsByCategory?searchCondition=Discount sale"></c:url>
								<li><a href="${url_3}">Discount sale</a></li>

								<c:url var="url_4"
									value="/all/product/productsByCategory?searchCondition=Limited Edition"></c:url>
								<li><a href="${url_4}">Limited Edition</a></li>
							</ul></li>-->
						<li><a href="">welcome
								${pageContext.request.userPrincipal.name }</a></li>
					</c:if>
					<li><a href="ContactUs">Contact us</a></li>
					<li><a href="AboutUs">About us</a></li>

					<c:if test="${pageContext.request.userPrincipal.name ==null}">
						<li><a href="<c:url value="/Login"></c:url>">Login</a></li>
						
					</c:if>




					<c:if test="${pageContext.request.userPrincipal.name !=null}">
						<li><a
							href="<c:url value="/j_spring_security_logout"></c:url>">logout</a></li>
					</c:if>
				</ul>

			</div>
		</nav>
	</div>

	<div id="hea" class="jumbotron">
		<h1 style="text-align: center">Bike-EShop</h1>
		<p style="text-align: center">Enjoy Riding Here</p>
	</div>

	
<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>
</body>
</html>