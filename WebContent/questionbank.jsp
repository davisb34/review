<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>

<link rel="shortcut icon" href="imgs/favicon-16x16.png" type="image/png">
<!-- describes what is displayed on the page -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- The parallax stylesheet -->
<link rel="stylesheet" href="CSS Files/parallax.css">

<!-- The stylesheet -->
<link rel="stylesheet" href="CSS Files/style.css">

<script src="https://use.fontawesome.com/8d8fa1da46.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link data-require="bootstrap-css@3.1.1" data-semver="3.1.1"
	rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
<script data-require="angular.js@1.3.0" data-semver="1.3.0"
	src="https://code.angularjs.org/1.3.0/angular.js"></script>
<script data-require="jquery@*" data-semver="2.0.3"
	src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script data-require="bootstrap@3.1.1" data-semver="3.1.1"
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="Javascript Files/questionBankScript.js"></script>
<script src="Javascript Files/dirPagination.js"></script>

<title>Question Bank Page</title>

</head>
<body class="parallax">

	<jsp:include page="/Jsp Template Files/revatureheader.jsp"></jsp:include>
	<div class="container" id="main">

		<!-- include the external file nav bar which has the google translate and throw all its contents here -->
		<jsp:include page="/Jsp Template Files/SlidingNav.jsp"></jsp:include>

		<div class="row">
			<div class="col-lg-12">
				<div ng-controller="MyQuestionBank" class="my-questionbank well">
					<h1>View Questions</h1>
					<br>
					<div class="panel panel-default">
						<div class="panel-body">
							<!-- 	
					{{orderByTopic}} -->
							<div class="row">
								<div class="col-xs-2">
									<h4>Page: {{ currentPage }}</h4>
								</div>

								<div class="col-xs-6">
									<h4>Filter by:</h4>
									<div class="row">
										<div class="col-xs-6">
											<label>Topics: </label><select class="form-control"
												ng-model="filtertopic"
												ng-options="item.tString for item in topics"></select>
										</div>
										<div class="col-xs-6">
											<label>Clients: </label><select class="form-control"
												ng-model="filterclients"
												ng-options="group.clientName for group in clients">
											</select>
										</div>
									</div>
								</div>

								<div class="col-xs-4">
									<label for="search">Search:</label> <input ng-model="q"
										id="search" class="form-control" placeholder="Filter text">
								</div>
								<div class="col-xs-4">
									<label for="search">items per page:</label> <input
										type="number" min="1" max="100" class="form-control"
										ng-model="pageSize">
								</div>
							</div>
							<br>
							<div class="panel panel-default">
								<div class="panel-body">
									<table
										class="table table-striped table-bordered table-hover table-responsive">
										<tr>
											<th ng-click="setOrderBy('topic')">Topic</th>
											<th ng-click="setOrderBy('question')">Questions</th>
											<th ng-click="setOrderBy('upvotes')">Popularity</th>
											<th ng-click="setOrderBy('lastUpdated')">Date</th>
											<th ng-click="setOrderBy('clientName')">Client</th>

										</tr>
										<tr
											dir-paginate="question in questions | orderBy:orderByTopic | filter:(!!filtertopic.topicId|| undefined) && {topicId:filtertopic.topicId}:true| filter:{clientId:filterclients.clientId} | filter:q | itemsPerPage: pageSize"
											current-page="currentPage">

											<td>{{ question.topic }}</td>
											<td>{{ question.question }}</td>
											<td>{{ question.upvotes }}</td>

											<td>{{ question.lastUpdated }}</td>
											<td>{{ question.clientName }}</td>

										</tr>

									</table>
								</div>
							</div>
							<!-- shouldnt need this div element -->
							<!-- <div> -->
							<div ng-controller="OtherController" class="other-controller">

								<div class="text-center">
									<dir-pagination-controls boundary-links="true"
										on-page-change="pageChangeHandler(newPageNumber)"
										template-url="dirPagination.html"></dir-pagination-controls>
								</div>
							</div>
							<!-- </div> -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/Jsp Template Files/revaturefooter.jsp"></jsp:include>
</body>
</html>