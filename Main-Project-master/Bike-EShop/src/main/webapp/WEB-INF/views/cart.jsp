<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">.nav {
  float:right!important;
  margin:0px;
}
#hea{
background-color:aqua;
margin-bottom:30px; !important;
height:20%;
} </style>
</head>
<body>
<!--  <a href="/order/${cartId}" class="btn btn-success pull-right" ><span class="glyphicon glypicon-shopping-cart"></span> CheckOut </a>-->

<div ng-app="app" ng-controller="ProductController">
<div ng-init="getCart(${cartId})">
<a href="" class="btn btn-danger pull-left" ng-click="clearCart()">
<span class="glyphicon glypicon-remove-sign"></span>Clear Cart
</a>

 <a href="<c:url value="/order/${cartId}"></c:url>" class="btn btn-success pull-right" ><span class="glyphicon glypicon-shopping-cart"></span> CheckOut </a>
<table class="table table-striped">
<thead>
<tr><th>Name</th><th>Quantity</th><th>Total Price</th>
</tr>
</thead>

<tr ng-repeat="cartItem in cart.cartItems">
<td>{{cartItem.product.name}}</td>
<td>{{cartItem.quantity}}</td>
<td>{{cartItem.totalPrice}}</td>
<td><a href="" class="label label-danger" pull-left ng-click="removeFromCart(cartItem.id)" > 
<span class="glyphicon glipicon-remove-sign"></span>Remove</a></td>
</tr>

</table>

TotalPrice:{{calculateGrandTotal()}}

</div>

</div>
<script src="<c:url value="/resources/js/controller.js"></c:url>"></script>
</body>
</html>