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
<title>Cadastramento de usuï¿½rio</title>

</head>

<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp" />

	<div class="container mt-3">
		<h2>Novo cadastro de tosa</h2>
		<form action="/tosas/incluir" method="post">
			<c:import url="/WEB-INF/jsp/partials/forms/servico.jsp" />

			<hr>

			<div class="flex-grow-1">
				<label for="estilo" class="form-label">Estilo</label> <input
					type="text" class="form-control" id="estilo" name="estilo">
			</div>

			<div class="form-check mb-3">
				<input class="form-check-input" type="checkbox" name="higienica"
					value="true"> <label class="form-check-label"> Tosa
					higiênica</label>
			</div>

			<div class="form-check mb-3">
				<input class="form-check-input" type="checkbox" name="aparar"
					value="true"> <label class="form-check-label">
					Aparar garras</label>
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>

</html>