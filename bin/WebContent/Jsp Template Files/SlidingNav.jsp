<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- import the js file for the sliding nav -->
<script src="Javascript Files/SlidingNav.js"></script>

<!-- import the css file for the sliding nav bar -->
<link rel="stylesheet" type="text/css" href="CSS Files/SlidingNav.css">
</head>
<body>

<!-- include the external file google translate and throw all its contents here -->
<jsp:include page="/Jsp Template Files/GoogleTranslate.jsp"></jsp:include>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="#">About</a>
  <a href="#">Services</a>
  <a href="#">Clients</a>
  <a href="#">Contact</a>
  <!-- specify the element that has the google translate -->
<div id="google_translate_element"></div>
</div>


</body>
</html>