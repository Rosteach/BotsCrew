<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html ng-app="myApp">
<head>
	<title>Home</title>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- CSS -->
        <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="resources/css/my.css"/>      
        <!-- JS -->
        <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/js/jquery-2.2.4.min.js"></script>         
     	<script type="text/javascript" src="resources/js/angular/angular.min.js"></script>
     	<script type="text/javascript" src="resources/js/angular/controllers/controller.js"></script>
            
</head>
<body ng-controller="myCtrl">

<pre>ChatBot (description: to send message please press Send)</pre>
	<div ng-repeat="message in messages">
		<div class="message">
			<p><b>{{message.role}}</b> {{message.message}}</p>
  		</div>
	</div>
	
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	  	<div class="navbar-header">  
	      <a class="navbar-brand" href="#">Chat Bot</a>
	    </div>
	  	
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	   		<form class="navbar-form navbar-left" role="search">
			  <div class="form-group">
			    	<input ng-model="userRequest" type="text" class="form-control" placeholder="Enter message...">
			  </div>
			</form>
			<button ng-click="sendMessage()" type="button" class="btn btn-info navbar-btn">Send</button>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>
<%-- <P>  The time on the server is ${serverTime}. </P> --%>
</body>
</html>
