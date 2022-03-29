<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<!-- JQuery -->
<script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
<script>
	$(function() {
		$('input[name=mfg]').datepicker({
			format : 'YYYY-mm-dd'
		});
	});
</script>
</head>
<body>
	<div class="container-wrapper">
		<div class="container">
			<c:url value="/admin/product/editProduct" var="url"></c:url>
			<form:form action="${url }" commandName="product" enctype="multipart/form-data">

				<div class="form-group">
					<label for="id"></label>
					<form:hidden path="id" />
				</div>

				<div class="form-group">
					<label for="name">Product Name</label>
					<form:input path="name" class="form-control" />
					<form:errors path="name" cssStyle="color:#ff0000"></form:errors>
				</div>

				<div class="form-group">
					<label for="description">Description</label>
					<form:input path="description" class="form-control" />
					<form:errors path="description" cssStyle="color:#ff0000"></form:errors>
				</div>

				<div class="form-group">
					<label for="price">Price</label>
					<form:input path="price" class="form-control" />
					<form:errors path="price" cssStyle="color:#ff0000"></form:errors>
				</div>

				<div class="form-group">
					<label for="quantity">Quantity</label>
					<form:input path="quantity" class="form-control" />
					<form:errors path="quantity" cssStyle="color:#ff0000"></form:errors>
				</div>

				<div class="form-group">
					<label for="mfg">Mfg Date</label>
					<fmt:formatDate value="${product.mfg }" var = "dateString" pattern="mm/dd/yyyy"/>
					<form:input path="mfg" class="form-control" />
					<form:errors path="mfg" cssStyle="color:#ff0000"></form:errors>
				</div>

				<div class="form-group">
					<label for="category">Category</label>
					<!-- List<Category> c =model.getAttribute("categories"); out.println(c.id) out.println(c.categoryDetails); -->
					
					<c:forEach var="c" items="${categories}">
						<form:radiobutton path="categoryDetails.id" value="${c.id}" />${c.categoryDetails }
					</c:forEach>
					
					</div>

				<div class="form-group">
					<label for="image">Image</label>
					<form:input path="image" type="file" />
				</div>

				<input type="submit" value="Edit Product" class="btn btn-default">
			</form:form>

		</div>


	</div>
</body>
<%@include file="footer.jsp"%>
</html>