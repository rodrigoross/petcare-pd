<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
<title>Cadastramento de consultas</title>

</head>

<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp" />

	<div class="container mt-3">
		<h2>Novo cadastro de consulta</h2>
		<form action="/consultas/incluir" method="post">
			<c:import url="/WEB-INF/jsp/partials/forms/servico.jsp" />

			<hr>

			<div class="d-flex flex-row gap-2 form-group mb-3">
				<div class="flex-grow-1">
					<label for="raca" class="form-label">Raça</label> <input
						type="text" class="form-control" id="raca" name="raca">
				</div>
				<div>
					<label for="peso" class="form-label">Peso</label> <input
						type="number" min="0" class="form-control" id="peso" name="peso">
				</div>
			</div>

			<div class="form-group mb-3">
				<label for="observacao" class="form-label">Observação</label>
				<textarea class="form-control"
					placeholder="Entre com a observação" name="observacao"></textarea>
			</div>

			<div class="form-check mb-3">
				<input class="form-check-input" type="checkbox" name="vacina"
					value="true"> <label class="form-check-label">
					Vacina</label>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>

</html>