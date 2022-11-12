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
<title>Cadastramento de solicitações</title>

</head>

<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp" />

	<div class="container mt-3">
		<h2>Novo cadastro</h2>
		<form action="/solicitacoes/incluir" method="post">

			<div class="d-flex gap-2">
				<div class="form-group flex-1">
					<label>Dono</label> <select name="dono" class="form-select">
						<c:forEach var="dono" items="${donos}">
							<option value="${dono.id}">${dono.nome}</option>
						</c:forEach>
					</select>
				</div>

				<div class="form-group">
					<label>Data</label> <input type="datetime-local"
						class="form-control" name="dtSolicitacao">
				</div>
			</div>

			<div class="form-group">
				<label>Descrição</label>
				<textarea class="form-control" placeholder="Entre com a descrição"
					name="descricao"></textarea>
			</div>
			<div class="form-group">
				<label>Serviço de transporte?</label>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="busca"
						value="true"> Buscar pet no meu endereço <label
						class="form-check-label"></label>
				</div>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="entrega"
						value="true"> Entregar pet no meu endereço <label
						class="form-check-label"></label>
				</div>
			</div>

			<div class="form-group">
				<label>Serviços</label>
				<c:forEach var="servico" items="${servicos}">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="servicos"
							value="${servico.id}"> <label class="form-check-label">
							${servico.nome}</label>
					</div>
				</c:forEach>
			</div>
			
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>

</html>