<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- import java util classes -->
<%@ page import="java.util.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- Bootstrap 3 is mobile-first -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- import angular js -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<!-- describes what is displayed on the page -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Core Page</title>

<!-- import my created angular controllers/ modules -->
<script src="../Angular Files/Modules/myApp.js"></script>
<script src="../Angular Files/Controllers/myCtrl.js"></script>
<script src="../Angular Files/Directives/w3TestDirective.js"></script>
<script src="../Angular Files/Services/myService.js"></script>



</head>
<body>

<!-- include the external file nav bar which has the google translate and throw all its contents here -->
<jsp:include page="../Jsp Template Files/SlidingNav.jsp"></jsp:include>

<!-- you need a div with the name main to specify what will get shifted over -->
<div id="main">
  
  <!-- <span id="opennav" style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; open</span> -->
 <span id="opennav" style="font-size:30px;cursor:pointer" onclick="toggleNav()">&#9776;</span>
 
 <!-- call my controller to bind my greetings and use the notranslate class attribute so google translate doesnt mess up the binding -->
<div ng-app="myApp" ng-controller="myCtrl3" class = "notranslate">
<h1 ng-bind= "myHeader"></h1>
<h1>{{theTime}}</h1>
</div>
  
  <!-- include the external file accordians and throw all its contents here -->
<jsp:include page="../Jsp Template Files/project3CoreTemplateAcordian.jsp"></jsp:include>
  
  <!-- include the external file accordians and throw all its contents here -->
<jsp:include page="../Jsp Template Files/revaturefooter.jsp"></jsp:include>
</div>
</body>
</html>