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
<title>Cadastramento de solicitações</title>

</head>
<body>
	<c:import url="/WEB-INF/jsp/partials/menu.jsp"/>
		
	<div class="container mt-3">
		<h3>Solicitações</h3>

		<div class="my-2">
			<table class="table table-striped table-bordered">
				<thead class="table-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Ordem</th>
						<th scope="col">Dono</th>
						<th scope="col">Descrição</th>
						<th scope="col">Busca</th>
						<th scope="col">Entrega</th>
						<th scope="col">Serviços</th>
						<th scope="col">Data</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="solicitacao" items="${lista}">
						<tr>
							<th scope="row">${solicitacao.id}</th>
							<td>${solicitacao.ordem}</td>
							<td>${solicitacao.dono.nome}</td>
							<td>${solicitacao.descricao}</td>
							<td>${solicitacao.busca}</td>
							<td>${solicitacao.entrega}</td>
							<td>${solicitacao.servicos.size()}</td>
							<td>${solicitacao.data}</td>
							<td class="text-center"><a class="btn btn-sm btn-danger"
								href="/solicitacoes/${solicitacao.id}/excluir"> Excluir </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>