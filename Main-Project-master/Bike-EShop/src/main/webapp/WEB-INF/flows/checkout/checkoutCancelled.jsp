<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<%@ page isELIgnored="false" %>
<div class="container-wrapper">
<div class="container">
<section>
<div class="jumbotron">
<div class="container">
<h1>Your Order Cancelled Successfully! </h1>

<h3>You can Go to Products by Clicking the Product</h3>
</div>
</div>
</section>

<section class="container">
<p><a href="<spring:url value="/all/product/getAllProducts" />" class="btn btn-default">Products</a></p>
</section>

<%@ include file="/WEB-INF/views/footer.jsp" %>