<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Cadastramento de serviços</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp" />

	<div class="container mt-3">
		<h2>Novo cadastro</h2>
		<form action="/servicos/incluir" method="post">
			<div class="form-group">
				<label for="nome" class="form-label">Nome</label> <input
					class="form-control" placeholder="Nome do serviço" name="nome" />
			</div>

			<div class="form-group mb-3">
				<label for="animal" class="form-label">Animal</label> <select
					name="animal" id="animal" class="form-select">
					<option value="Cão">Cão</option>
					<option value="Gato">Gato</option>
					<option value="Camundongo">Camundongo</option>
					<option value="Pássaro">Pássaro</option>
				</select>
			</div>

			<div class="mb-3">
				<label for="valor" class="form-label">Valor</label> <input
					type="number" min="0" step="1" class="form-control" id="valor"
					name="valor">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>