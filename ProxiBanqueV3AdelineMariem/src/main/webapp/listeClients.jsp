<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste clients</title>
</head>
<body>

	<h1>Liste de vos clients</h1>

	<c:forEach items="${clients}" var="c">
		<p/>${c.nomClient}
<p/>${c.prenomClient}
<p/>${c.adresse}
<p/>${c.codePostal}
<p/>${c.ville}
<p/>${c.telephone}
</c:forEach>

</body>
</html>