<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Cadastramento de usuários</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp"/>
	
	<div class="container mt-3">
		<h3>Usuários</h3>

		<div class="my-2">
			<table class="table table-striped table-bordered">
				<thead class="table-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Nome</th>
						<th scope="col">E-mail</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${lista}">
						<tr>
							<th scope="row">${usuario.id}</th>
							<td>${usuario.nome}</td>
							<td>${usuario.email}</td>
							<td class="text-center"><a class="btn btn-sm btn-danger"
								href="/usuarios/${usuario.id}/excluir"> Excluir </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>