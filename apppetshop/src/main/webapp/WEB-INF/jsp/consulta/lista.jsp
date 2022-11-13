<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Cadastramento de consultas</title>

</head>
<body>	
	<c:import url="/WEB-INF/jsp/partials/menu.jsp"/>
	
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h3>Consultas</h3>

			<a href="/consultas/incluir" class="btn btn-dark"> Novo </a>
		</div>

		<div class="container my-2">
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th scope="col">Raça</th>
						<th scope="col">Vacina</th>
						<th scope="col">Peso</th>
						<th scope="col">Observação</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="consulta" items="${lista}">
						<tr>
							<th scope="row">${consulta.raca}</th>
							<td>${consulta.vacina}</td>
							<td>${consulta.peso}</td>
							<td>${consulta.observacao}</td>
							<td class="text-center"><a class="btn btn-sm btn-danger"
								href="/consultas/${consulta.id}/excluir"> Excluir </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>