<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<title>spring-microservices: Account Details</title>
</head>
<body>
			<h1>Account Details</h1>
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3">Account:</div>
					<div class="col-sm-9">${account.number}</div>
				</div>
				<div class="row">
					<div class="col-sm-3">Name:</div>
					<div class="col-sm-9">${account.name}</div>
				</div>
				<div class="row">
					<div class="col-sm-3">Amount:</div>
					<div class="col-sm-9">${account.amount}</div>
				</div>
			</div>
</body>
</html>