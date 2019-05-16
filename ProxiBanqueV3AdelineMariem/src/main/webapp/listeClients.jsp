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
	<form action="ServletListeClients" method="get">
		<h1>Liste de vos clients</h1>


		<c:forEach items="${clients}" var="c">
			<table>
				<tr>
					<td>Nom</td>
					<td>Prénom</td>
					<td>Adresse</td>
					<td>Code Postal</td>
					<td>Ville</td>
					<td>Téléphone</td>
				</tr>
				<tr>
					<td>${c.nomClient}</td>
					<td>${c.prenomClient}</td>
					<td>${c.adresse}</td>
					<td>${c.codePostal}</td>
					<td>${c.ville}</td>
					<td>${c.telephone}</td>
				</tr>
			</table>
		</c:forEach>

	</form>
</body>
</html>