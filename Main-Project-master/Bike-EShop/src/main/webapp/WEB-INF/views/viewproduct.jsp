<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>particular product details</title>
<style  type="text/css">
ageAlign {
	text-align: center;
}

.glyphicon glyphicon-shopping-cart {
	font-size: 200px;
}
.col-xs-4 {}
.col-md-4 {width:600px}
.col-md-offset-4{}
.nav {
  float:right!important;
  margin:0px;
}
#hea{
background-color:aqua;
margin-bottom:30px; !important;
height:20%;
} </style>
</head>
<body ng-app="app" ng-controller="ProductController">


	<div class="ContactHead">
		<div class="page-header">
			<div style="padding-left: 500px;">
				<c:url var="src" value="/resources/images/${product.id}.png"></c:url>
				<img src="${src}" style="width: 50%" align="middle" />
			</div>
			<br>
			<div class="container">
				<div class="row">
					<div class="col-xs-4 col-md-4 col-md-offset-4" >

						<b>PRODUCT DETAILS</b>
						<table>
							<tr>
								<td>Product Name:</td>
								<td>${product.name}</td>

							</tr>
							<tr>
								<td>Product Description:</td>
								<td>${product.description}</td>

							</tr>
							<tr>
								<td>Product Price:</td>
								<td>${product.price}</td>

							</tr>
							<tr>
								<td>Product Category details:</td>
								<td>${product.categoryDetails.categoryDetails}</td>

							</tr>
							<tr>
								<td>Manufacturing date:</td>
								<td>${product.mfg}</td>

							</tr>
						</table>

					</div>
					<security:authorize access="hasRole('ROLE_USER')">
						<div>
							<a href="" ng-click="addToCart(${product.id })"><span
								class="glyphicon glyphicon-shopping-cart"
								style="font-size: 50px"></span></a>


						</div>
					</security:authorize>

				</div>
			</div>
		</div>
	</div>


	    

	<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>

</body>
<%@include file="footer.jsp"%>
</html>