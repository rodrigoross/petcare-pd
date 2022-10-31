<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
<title>Cadastramento de donos</title>

</head>
<body>
	<div class="container mt-3">
		<h3>Donos</h3>
		
		<div class="my-2">
			<table class="table table-striped table-bordered">
				<thead class="table-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Código</th>
						<th scope="col">Animal</th>
						<th scope="col">Nome</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dono" items="${lista}">
						<tr>
							<th scope="row">${dono.id}</th>
							<td>${dono.nome}</td>
							<td>${dono.telefone}</td>
							<td>${dono.cpf}</td>
							<td class="text-center">
								<a class="btn btn-sm btn-danger"
									href="/donos/${dono.id}/excluir">
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