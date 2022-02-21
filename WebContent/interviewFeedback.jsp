<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- import angular -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<!-- Modal CSS -->
<link rel="stylesheet" type="text/css" href="CSS Files/feedback-modal-style.css">

<!-- Carousel CSS -->
<link rel="stylesheet" type="text/css"
	href="CSS Files/carousel-style.css">

<title>interview feedback Page</title>

<!-- import my created angular controllers/ modules -->
<script src="Angular Files/Modules/myApp.js"></script>
<script src="Angular Files/Controllers/interviewFeedbackAddQuestionController.js"></script>
<script src="Angular Files/Directives/w3TestDirective.js"></script>
<script src="Angular Files/Services/myService.js"></script>
</head>
<body>

	<!-- include the jsp header -->
	<jsp:include page="Jsp Template Files/revatureheader.jsp"></jsp:include>

	<!-- include the modal for feedback -->
	<jsp:include page="Jsp Template Files/interviewFeedbackModal.jsp"></jsp:include>

	<!-- put data inside a bootsrap container -->
	<div class="container">

		<!-- you need a div with the name main to specify what will get shifted over -->
		<div id="main">

			<!-- include the external file nav bar which has the google translate and throw all its contents here -->
			<jsp:include page="/Jsp Template Files/SlidingNav.jsp"></jsp:include>

			<div>
				
				
				
				<!-- button to pop up modal -->
				<button type="button" class="btn btn-info btn-lg"
					data-toggle="modal" data-target="#feedback-modal" id="modal-button">Feedback</button>

				<!-- include the footer from the template files -->
				<jsp:include page="/Jsp Template Files/revaturefooter.jsp"></jsp:include>

			</div>

		</div>

	</div>


</body>
</html>