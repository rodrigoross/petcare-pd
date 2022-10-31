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
	<div class="container mt-3">
		<h3>Banhos</h3>

		<div class="my-2">
			<table class="table table-striped table-bordered">
				<thead class="table-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Código</th>
						<th scope="col">Animal</th>
						<th scope="col">Nome</th>
						<th scope="col">Porte</th>
						<th scope="col">Observação</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="banho" items="${lista}">
						<tr>
							<th scope="row">${banho.id}</th>
							<td>${banho.codigo}</td>
							<td>${banho.animal}</td>
							<td>${banho.nome}</td>
							<td>${banho.porte}</td>
							<td>${banho.observacao}</td>
							<td class="text-center">
								<a class="btn btn-sm btn-danger"
									href="/banhos/${banho.id}/excluir">
									Excluir 
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>