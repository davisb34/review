<section>
	<!-- import the js file for the sliding nav -->
	<script src="Javascript Files/SlidingNav.js"></script>

	<!-- import the css file for the sliding nav bar -->
	<link rel="stylesheet" type="text/css" href="CSS Files/SlidingNav.css">

	<!-- include the external file google translate and throw all its contents here -->
	<jsp:include page="/Jsp Template Files/GoogleTranslate.jsp"></jsp:include>

	<div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a href="https://revature.com/">About</a> 
		<a href="https://revature.com/contactus.html">Contact</a>
		<!-- specify the element that has the google translate -->
		<div id="google_translate_element"></div>
	</div>
</section>