<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<title>spring-microservices: Account List</title>
</head>

<body>
			<h1>Account List</h1>
			<ul>
				<c:forEach items="${accounts}" var="account">
					<li><a href="accountDetails?number=${account.number}">${account.name}</a></li>
				</c:forEach>
			</ul>
</body>
</html>