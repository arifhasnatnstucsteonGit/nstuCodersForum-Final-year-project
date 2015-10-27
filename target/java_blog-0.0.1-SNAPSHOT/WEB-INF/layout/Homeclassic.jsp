<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  
<!DOCTYPE html>
<html>
<head>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<!-- jQuery  -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>






<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>
</head>
<body>


<!-- header image start -->

						
						 <a href='<spring:url value="/"/>'>
						 <img  src="/css/photo/implemented.png" class="img-responsive center-block" alt="img_ban" height="100%" width="83.5%">
						 
 <!-- header image end-->
 
 
	<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
		prefix="tilesx"%>
	<tilesx:useAttribute name="current" />

    
<%-- 	<h3>You are Now.  >> .</h3><h3><b>${current}</b></h3> --%>

	<div class="container">


		<!-- Static navbar -->
		<nav class="navbar navbar-default navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="<spring:url value="/" />">NCF</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="${current== 'index' ? 'active' : '' }"><a
							href='<spring:url value="/" />'>Home</a></li>

							 <security:authorize access="hasRole('ROLE_ADMIN')">	
							<li class="${current== 'users' ? 'active' : '' }"><a
								href="<spring:url value="/users.html"/>">Users</a></li>
						    </security:authorize>
						    
						    
						    
						    
						<security:authorize access=" isAuthenticated()">
							<li class="${current== 'home' ? 'active' : '' }"><a
								href="<spring:url value="/home.html"/>">Forum Home</a></li>
						</security:authorize>
						
						<security:authorize access="! isAuthenticated()">
							<li class="${current== 'register' ? 'active' : '' }"><a
								href="<spring:url value="/register.html"/>">Register</a></li>
						</security:authorize>
						
						
                           <li class="${current== 'index' ? 'active' : '' }"><a
							href='<spring:url value="/" />'>Home</a></li>

							 <security:authorize access="hasRole('ROLE_ADMIN')">	
							<li class="${current== 'users' ? 'active' : '' }"><a
								href="<spring:url value="/users.html"/>">Users</a></li>
						    </security:authorize>
						
						
						
						
							<li class="${current== 'home' ? 'active' : '' }"><a
								href="<spring:url value="/home.html"/>">Forum</a></li>
                             <security:authorize access="! isAuthenticated()">

					   <li class="${current== 'login' ? 'active' : '' }"><a
								href="<spring:url value="/login.html"/>">Login</a></li>
						</security:authorize>

						<security:authorize access=" isAuthenticated()">
							<li><a href="<spring:url value="/logout"/>">Logout</a></li>
						</security:authorize>

								 <li class="${current== 'tutorialPage' ? 'active' : '' }"><a
								href="<spring:url value="/tutorialPage.html"/>">All Tutorials</a></li>
					</ul>

				</div>
				<!--/.nav-collapse -->
				
				
	    <div class="jumbotron">
        <h1>NSTU Coders Forum</h1>
        <p class="lead">NSTU coders Forum is a forum based site . where nstu's professional coders are in to solve your coding problems .
        <br></br>Here You can share your knowledge and thinking with 'Blog' writings and also with tutorial .
        
        You can post your question and problems and can give a solution of others problems .
         So, Please login to join us.</p>
        <p><a class="btn btn-lg btn-success" href="<spring:url value="/register.html"/>" role="button">Sign up today</a></p>
      </div>
				
				
			</div>
		</nav>

		<tiles:insertAttribute name="body" />
		<br> <br>
		<center>
			<tiles:insertAttribute name="footer" />
		</center>

	</div>



</body>
</html>