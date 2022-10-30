<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Cadastramento de Banhos</title>
</head>
<body>
	<div class="container-fluid mt-3">
		<h3>Banhos - ${lista.size()}</h3>

		<div class="container my-2">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col">Código</th>
						<th scope="col">Animal</th>
						<th scope="col">Nome</th>
						<th scope="col">Porte</th>
						<th scope="col">Observação</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="banho" items="${lista}">
						<tr>
							<th scope="row">${banho.codigo}</th>
							<td>${banho.animal}</td>
							<td>${banho.nome}</td>
							<td>${banho.porte}</td>
							<td>${banho.observacao}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>