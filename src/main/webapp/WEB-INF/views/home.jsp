<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>AngularJS $http Example</title>
<style>
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="../js/app.js"></script>
<script src="/static/js/service/user_service.js"></script>
<script src="/static/js/controller/user_controller.js"></script>
<body>
	<div ng-app="myApp">
		<div ng-controller="UserController">
			<a href="#" ng-click="showdiv()">show</a>
			<div id="loadDireactive" ng-if="anableCustomerDirectivev">
				<div my-Customer></div>
				<my-Customer></my-Customer>
			</div>
		</div>

	</div>
</body>
</html>
