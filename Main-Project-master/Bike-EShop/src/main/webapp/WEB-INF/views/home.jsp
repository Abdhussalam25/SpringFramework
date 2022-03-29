<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
<style>
 img.zoom-img:hover {
	-webkit-transform: scale(1.15);
	-webkit-transition-timing-function: ease-out;
	-webkit-transition-duration: 750ms;
	-moz-transform: scale(1.15);
	-moz-transition-timing-function: ease-out;
	-moz-transition-duration: 750ms;
	overflow: hidden;
}</style>

</head>
<body>
 <header>
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!--Indicators-->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1" ></li>
      <li data-target="#myCarousel" data-slide-to="2" ></li>
      <li data-target="#myCarousel" data-slide-to="3" ></li>
      <li data-target="#myCarousel" data-slide-to="4" ></li>
      <li data-target="#myCarousel" data-slide-to="5" ></li>
    </ol>
    <!--Wrapper For slides-->
    <div class="carousel-inner" role="listbox">
        <div class="item active">
        <img src="resources\images\1299superleggera.jpg" alt="1299superleggera" class="img-responsive">
      </div>

      <div class="item">
        <img src="resources\images\ApacheRTR200.jpg" alt="ApacheRTR200" class="img-responsive">
      </div>
    
      <div class="item">
        <img src="resources\images\bmwG310R.jpg" alt="bmwG310R" class="img-responsive" >
      </div>

      <div class="item">
        <img src="resources\images\DOMINAR 400.jpg" alt="DOMINAR 400" class="img-responsive" >
      </div>

      <div class="item">
        <img src="resources\images\hondanavi.jpg" alt="hondanavi" class="img-responsive">
      </div>
      <div class="item">
        <img src="resources\images\MGX21.jpg" alt="MGX21" class="img-responsive">
      </div>
      
    </div>

        <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>

  </div>         
        
 </header>
    

<br>
<br>
<br>
<c:if test="${pageContext.request.userPrincipal.name==null }">
<div class="product">
		<div class="container">
			<div class="product-top">
				<div class="product-one">
					<div class="col-md-12 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/Login" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\bikes-racing-images.jpg" alt="Click On the Image" /></a>
							<div class="product-bottom" style="text-align:center">
											
							</div>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</c:if>
					
<security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_USER')">
<div class="product">
		<div class="container">
			<div class="product-top">
				<div class="product-one">
					<div class="col-md-4 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/all/product/getAllProducts" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\1299superleggera.jpg" alt="1299superleggera" /></a>
							<div class="product-bottom" style="text-align:center">
								<h3 >1299superleggera</h3>

								<h4>
									<a class="item_add" href="#"><i></i></a> <span
										class=" item_price"> &#8377; 175000</span>
								</h4>
							</div>
							
						</div>
					</div>
					<div class="col-md-4 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/all/product/getAllProducts" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\ApacheRTR200.jpg" alt="ApacheRTR200"/></a>
							<div class="product-bottom" style="text-align:center">
								<h3>ApacheRTR200</h3>
								<h4>
									<a class="item_add" href="#"><i></i></a> <span
										class=" item_price"> &#8377; 157000</span>
								</h4>
							</div>
							
						</div>
					</div>
					<div class="col-md-4 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/all/product/getAllProducts" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\bmwG310R.jpg" alt="bmwG310R"/></a>
							<div class="product-bottom" style="text-align:center">
								<h3>bmwG310R</h3>
								<h4>
									<a class="item_add" href="#"><i></i></a> <span
										class=" item_price">&#8377; 165000</span>
								</h4>
							</div>
							
						</div>
					</div>
					<div class="clearfix"></div>
					</div>

				<div class="product-one">
					<div class="col-md-4 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/all/product/getAllProducts" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\DOMINAR 400.jpg" alt="DOMINAR 400"/></a>
							<div class="product-bottom" style="text-align:center">
								<h3>DOMINAR 400</h3>
								<h4>
									<a class="item_add" href="#"><i></i></a> <span
										class=" item_price">&#8377; 147999</span>
								</h4>
							</div>
				
						</div>
					</div>
					
				
				
					<div class="col-md-4 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/all/product/getAllProducts" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\Hardley-Davidson.jpg" alt="Hardley-Davidson"/></a>
							<div class="product-bottom" style="text-align:center">
								<h3>Hardley-Davidson</h3>
								<h4>
									<a class="item_add" href="#"><i></i></a> <span
										class=" item_price">&#8377; 300000</span>
								</h4>
							</div>
					
						</div>
					</div>
					<div class="col-md-4 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="/Bike-EShop/all/product/getAllProducts" class="mask"><img
								class="img-responsive zoom-img" src="resources\images\Bikeimages\Ducati750.jpg" alt="Ducati750"/></a>
							<div class="product-bottom" style="text-align:center">
								<h3>Ducati750</h3>
								<h4>
									<a class="item_add" href="#"><i></i></a> <span
										class=" item_price">&#8377; 275000</span>
								</h4>
							</div>
					
						</div>
					</div>
					
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</div>
	
</security:authorize>





<div class="container-fluid">
<div class="row">
<div class="col-xs-12"> <div class="CustomDiv">
	


</div>


</div>

</div>



</div>



</body>
<%@include file="footer.jsp"%>

</html>