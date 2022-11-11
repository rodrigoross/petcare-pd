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
<title>Cadastramento de donos</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp" />

	<div class="container mt-3">

		<form action="/cep" class="form-inline" method="post">

			<div class="form-group">
				<label>CEP</label> <input type="text" class="form-control"
					placeholder="Entre com o seu CEP" name="cep">
			</div>
			<button type="submit" class="btn btn-secondary">Buscar</button>
		</form>

		<h2>Novo dono</h2>
		<form action="/donos/incluir" method="post">
			<div class="mb-3">
				<label for="nome" class="form-label">Nome</label> <input type="text"
					class="form-control" id="nome" name="nome">
			</div>
			<div class="mb-3">
				<label for="telefone" class="form-label">Telefone</label> <input
					type="tel" class="form-control" id="telefone" name="telefone">
			</div>
			<div class="mb-3">
				<label for="cpf" class="form-label">CPF</label> <input type="text"
					class="form-control" id="cpf" name="cpf">
			</div>

			<c:import url="/WEB-INF/jsp/partials/forms/endereco.jsp" />

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>