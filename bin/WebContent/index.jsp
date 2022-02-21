<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="CSS Files/modal-style.css">
<link rel="stylesheet" type="text/css" href="CSS Files/carousel-style.css">
<title>RAS Landing Page</title>
</head>
<body>

	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<img alt="Revature"
					src="https://pbs.twimg.com/profile_images/705134292368621568/ZnelWSSO.jpg" width="460" height="345" >
				<div class="carousel-caption">
				<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#login-modal">Login</button>
				</div>
			</div>
			<div class="item">
				<img src="https://scontent-lga3-1.xx.fbcdn.net/v/t1.0-9/14064067_322489338090284_8737086769383610177_n.png?oh=7b64143dcc55cbef89c479dc475e379d&oe=58F729FE" width="460" height="345">
				<div class="carousel-caption">
					<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#login-modal">Login</button>
					<p></p>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	<div class="modal fade" id="login-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true"
		style="display: none;">
		<div class="modal-dialog">
			<div class="loginmodal-container">
				<img id="log-img" class="log-img-card"
					src="https://pbs.twimg.com/profile_images/705134292368621568/ZnelWSSO.jpg" />
				<h1>Login to Your Account</h1>
				<br>
				<form id="login-form" name="login-form" class="text-left"
					action="login.do" method="post" >

					<!-- for ajax, wrong password, username -->
					<div class="login-form-main-message"></div>

					<div class="main-login-form">
						<div class="login-group">
							<div class="form-group">
								<label for="lg_username" class=sr-only>Username</label> <input
									type="text" class="form-control" name="lg_username"
									placeholder="username" />
							</div>
							<div class="form-group">
								<label for="lg_password" class=sr-only>Password</label> <input
									type="password" class="form-control" name="lg_password"
									placeholder="password" />
							</div>
							<input type="submit" class="login loginmodal-submit" id = "lg_button" value="LOGIN"/>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>