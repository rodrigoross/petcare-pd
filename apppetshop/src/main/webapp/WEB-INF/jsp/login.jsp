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
<title>Login</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/partials/menu.jsp" />
	
	<main class="form-signin container mt-3">
		<form action="/login" method="post">
			<h1 class="h3 mb-3 fw-normal">Acesse o sistema</h1>

			<div class="form-floating my-2">
				<input type="email" class="form-control" id="email"
					placeholder="name@example.com" name="email"> <label
					for="email">E-mail</label>
			</div>
			<div class="form-floating mb-3">
				<input type="password" class="form-control" id="senha"
					placeholder="supersecreto" name="senha"> <label
					for="senha">Senha</label>
			</div>

			<button class="w-100 btn btn-lg btn-primary" type="submit">Entrar</button>
			<p class="mt-5 mb-3 text-muted">© 2022</p>
		</form>
	</main>
</body>
</html>