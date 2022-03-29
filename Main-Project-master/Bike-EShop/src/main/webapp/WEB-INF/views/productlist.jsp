
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List page</title>
<link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      
       <!-- JQuery -->
    <script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
      

<style type="text/css">
#row{
width:50px;
height:50px;
}
.nav {
  float:right!important;
  margin:0px;
}
#hea{
background-color:aqua;
margin:0px; !important;
height:20%;
}
.container{
margin-top:20px;
}

</style>
<script>
$(document).ready(function(){
	var searchCondition='${searchCondition}';
	$('.table').DataTable({
		"lengthMenu":[ [ 3,  5, 7, -1], [ 3, 5, 7, "All" ] ],
		"oSearch": { 
			"sSearch" : searchCondition
			}
	})
});
</script>


</head>
<body>

	<div class="container">
	
	<h3 style="text-align:center">PRODUCT LIST</h3>

		<table class="table table-striped">
		
			<thead>
				<tr>
					<th>Product Image</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Category</th>
					<th>View<security:authorize access="hasRole('ROLE_ADMIN')">/Edit/Delete </security:authorize></th>

				</tr>
			</thead>
			<c:forEach var="p" items="${productlist}">
				<tr id="row">
				   
				  
					<td> <c:url var="src" value="/resources/images/${p.id }.png"></c:url> <img src="${src}" style="width: 30%" align="middle"/> </td>
					
					<td>${p.name }</td>

					<td>${p.description }</td>

					<td>${p.categoryDetails.categoryDetails}</td>
					<!-- First categoryDetails is an object second one also that same object name -->
					<c:url var="url" value="/all/product/viewproduct/${p.id }"></c:url>
					
					
					<td><a href="${url}"><span
							class="glyphicon glyphicon-info-sign"></span></a> <c:url var="delete"
							value="/admin/product/deleteproduct/${p.id }"></c:url>
							
					<security:authorize access="hasRole('ROLE_ADMIN')">
							 <a	href="${delete}"><span class="glyphicon glyphicon-remove"></span></a>

						<c:url var="edit" value="/admin/product/editform/${p.id }"></c:url>
						<a href="${edit}"><span class="glyphicon glyphicon-pencil"></span></a>
					</security:authorize>
					</td>
					
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
<%@include file="footer.jsp" %>
</html>