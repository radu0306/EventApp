<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>QuickEvent - ${title}</title>

<!-- Bootstrap Core CSS -->
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">

<!-- Fonts -->
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href='http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>

<!-- Custom Theme CSS -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">

	
		<!-- NAVBAR  -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- PAGE CONTENT  -->
		
		
			<c:if test="${userClickHome == true }">
				<%@include file="./home.jsp"%>
			</c:if>

			<!-- Load only when clicked report -->
			<c:if test="${userClickReport == true }">
				<%@include file="./report.jsp"%>
			</c:if>

			<!-- Load only when clicked reportedEvents -->
			<c:if test="${userClickReportedEvents == true }">
				<%@include file="./reportedEvents.jsp"%>
			</c:if>

			<!-- <div id="map"></div> -->

			<!-- Core JavaScript Files -->
			<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
			<script
				src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
			<script
				src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

			<!-- Google Maps API Key - You will need to use your own API key to use the map feature -->
			<script type="text/javascript"
				src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

			<!-- Custom Theme JavaScript -->
			<script src="${js}/grayscale.js"></script>
			
		<!-- Custom table theme -->
			<script src="${js}/table.js"></script>
		<!-- FOOTER -->
		<%@include file="./shared/footer.jsp"%>
	
</body>

</html>
