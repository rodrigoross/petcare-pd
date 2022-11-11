<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="ISO-8859-1">
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
			<title>Cadastramento de consultas</title>

		</head>

		<body>
			<c:import url="/WEB-INF/jsp/partials/menu.jsp" />

			<div class="container mt-3">
				<h2>Novo cadastro</h2>
				<form action="/registrar" method="post">
					<div class="mb-3">
						<label for="nome" class="form-label">Nome</label>
						<input type="text" class="form-control" id="nome" name="nome" aria-describedby="nomeHelp">
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">E-mail</label> <input type="email" class="form-control"
							id="email" name="email" aria-describedby="emailHelp">
						<div id="emailHelp" class="form-text">Seu e-mail estar� seguro conosco.</div>
					</div>
					<div class="mb-3">
						<label for="senha" class="form-label">Senha</label> <input type="password" class="form-control"
							id="senha" name="senha">
					</div>
					<button type="submit" class="btn btn-primary">Cadastrar</button>
				</form>
			</div>
		</body>

		</html>