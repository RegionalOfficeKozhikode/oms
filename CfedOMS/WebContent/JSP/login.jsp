<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> O M S </title>
<script type="text/javascript" src="JS/login.js"></script>
<link rel="stylesheet" href="CSS/login.css">
</head>
<body id="body" style="overflow:hidden;">
<div>
<section class="loginform cf">
<form name="login" action="home.html" method="post" accept-charset="utf-8">
	<ul>
		<li><label for="usermail">Email</label>
		<input type="email" name="username" placeholder="yourname@email.com" required></li>
		<li><label for="password">Password</label>
		<input type="password" name="password" placeholder="password" required></li>
		<li>
		<input type="submit" value="Login"></li>
		
		<li>${message}</li>
	</ul>
</form>
</section>
</div>

<div id="abc">
<!-- Popup Div Starts Here -->
<div id="popupContact">
<!-- Contact Us Form -->
<form action="registration.html" id="form" method="get" name="form">
<img id="close" src="IMAGES/close.png" onclick ="div_hide()">
<h2>Register with us</h2>
<hr>
<input id="firstname" name="firstName" placeholder="Name" type="text">
<input id="emailId" name="emailId" placeholder="Your Email" type="text">
<input id="employeeId" name="employeeId" placeholder="BeeBee Id" type="text">
<textarea id="msg" name="message" placeholder="Message"></textarea>
<a href="check_empty()" id="submit">Send</a>
</form>
</div>
<!-- Popup Div Ends Here -->
</div>

<!-- Display Popup Button -->

<button id="popup" onclick="div_show()">Sign up</button>

</body>
</html>