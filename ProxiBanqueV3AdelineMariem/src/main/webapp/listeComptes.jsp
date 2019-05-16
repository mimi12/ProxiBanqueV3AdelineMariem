<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des comptes</title>
</head>
<body>
	<form action="ServletListeComptes" method="get">
		<h1>Liste des comptes</h1>
		<c:forEach items="${comptes}" var="co">
			<table>
				<tr>
					<td>Solde du compte</td>
					<td>Date d'ouverture du compte</td>
				</tr>

				<tr>
					<td>${co.soldeCompte}</td>
					<td>${co.dateOuvertCompte}</td>
				</tr>
			</table>
		</c:forEach>


	</form>
</body>
</html>