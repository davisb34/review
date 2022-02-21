<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Bootstrap 3 is mobile-first -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- import angular js -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<!-- describes what is displayed on the page -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- The stylesheet -->
<link rel="stylesheet" href="CSS Files/style.css">
<script src="https://use.fontawesome.com/8d8fa1da46.js"></script>
<!-- The parallax stylesheet -->
<link rel="stylesheet" href="CSS Files/parallax.css">
<!-- Modal CSS -->
<link rel="stylesheet" type="text/css" href="CSS Files/feedback-modal-style.css">
<title>RAS Core Page</title>
<!-- import my created angular controllers/ modules -->
<script src="Angular Files/Modules/myApp.js"></script>
<script src="Angular Files/Controllers/myCtrl.js"></script>
<script src="Angular Files/Directives/w3TestDirective.js"></script>
<script src="Angular Files/Services/myService.js"></script>

<script src="Angular Files/Controllers/corePage.js"></script>
<script src="Angular Files/Controllers/interviewFeedbackAddQuestionController.js"></script>


<link rel="shortcut icon" href="imgs/favicon-16x16.png" type="image/png"> 



</head>
<body class="parallax" ng-app="myApp">
	<jsp:include page="Jsp Template Files/revatureheader.jsp"></jsp:include>
	<!-- you need a div with the name main to specify what will get shifted over -->

	<div id="main">
	
		<!-- include the external file nav bar which has the google translate and throw all its contents here -->
		<jsp:include page="/Jsp Template Files/SlidingNav.jsp"></jsp:include>

		<!-- call my controller to bind my greetings and use the notranslate class attribute so google translate doesnt mess up the binding -->
		<div class="row">
			<div ng-controller="myCtrl3" class="notranslate well col-xs-3">
				<span>
					<h4 ng-bind="myHeader"></h4>
					<h6>{{theTime}}</h6>
				</span>

				<!-- include twitter feed -->
				<%@include file="twitter.html"%>
			</div>
			<!-- include the external file accordians and throw all its contents here -->
			<div class="col-xs-9">
				<jsp:include
					page="/Jsp Template Files/project3CoreTemplateAcordian.jsp"></jsp:include>
				<!-- include the external file accordians and throw all its contents here -->
			</div>
		</div>
	</div>
	<jsp:include page="/Jsp Template Files/revaturefooter.jsp"></jsp:include>
</body>
</html>