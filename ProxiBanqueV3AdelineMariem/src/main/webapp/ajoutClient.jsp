<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout client</title>
</head>
<body>
	<h1>Ajout d'un client</h1>
	<h4>Remplissez les champs ci-dessous</h4>
	<form method="post" action="ServletAjoutClient">
		<table>
			<tr>
				<td>Nom</td>
				<td><input type="text" name="nomClient"
					placeholder="Saisissez le nom du client" /></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><input type="text" name="prenomClient"
					placeholder="Saisissez le prénom du client" /></td>
			</tr>
			<tr>
				<td>Adresse</td>
				<td><input type="text" name="adresseClient"
					placeholder="Saisissez l'adresse du client" /></td>
			</tr>
			<tr>
				<td>Ville</td>
				<td><input type="text" name="villeClient"
					placeholder="Saisissez la ville du client" /></td>
			</tr>
			<tr>
				<td>Code Postal</td>
				<td><input type="text" name="codePostalClient"
					placeholder="Saisissez le code postal du client" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="emailClient"
					placeholder="Saisissez l'email du client" /></td>
			</tr>
			<tr>
				<td>Téléphone</td>
				<td><input type="text" name="telephoneClient"
					placeholder="Saisissez le téléphone du client" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Annuler" /></td>

				<td><input type="submit" value="Envoyer" /></td>
			</tr>

		</table>

	</form>

</body>
</html>