<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bike-EShop</title>
<style>
.CustomDiv {
	background-color: red;
}

#Login {
	text-align: right;
}

.ContactHead {
	margin-top: 75px;
	margin-right: 75px;
	margin-left: 75px;
	margin-bottom: 0px; ! important;
	background-color: #ffffff;
	text-align: center;
	font-family: arial;
}

.tableStyle {
	margin-right: 100px;
	margin-left: 100px;
	margin-top: 10px;
}
.tableSty{
margin-right: 75px;
margin-left: 100px;
margin-top: 10px;


}

#tableColumn {
	padding-top: 50px;
}

#footer{
margin:100px;
}
</style>


</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-xs-4 col-md-4 col-md-offset-4">

				<div class="ContactHead">
					<h1>
						<b> <u><i>CONTACT US</i></u>
						</b>
					</h1>
				</div>
				<div>
					<table>
						<tr>
							<th>
								<div class="tableStyle">
									<b>Name</b>
								</div>
							</th>
							<td>
								<div id="tableColumn">
									A.SALAMBASHA<br>DT-Batch-15<br>NIIT-Ambattur<br>Chennai.
								</div>
							</td>
						</tr>
						<tr>
							<th>
								<div class="tableStyle">
									<b>Email</b>
								</div>
							</th>
							<td>
								<div>
									<a href="mailto:salambashaeee@gmail.com"
										title=" My email address">salambashaeee@gmail.com</a>
								</div>
							</td>
						</tr>
						<tr>
							<th>
								<div class="tableSty">
									<b>PhoneNumber</b>
								</div>
							</th>
							<td>
								<div> 9176244128 </div>
							</td>
						</tr>


					</table>
				</div>

			</div>
		</div>
	</div>

<div id="footer"><%@include file="footer.jsp"%></div>

</body>
</html>