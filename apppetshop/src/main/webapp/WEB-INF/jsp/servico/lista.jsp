<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Cadastramento de serviços</title>

</head>
<body>
	<!-- TODO REMOVER QUANDO USAR COMPONENTES -->
	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">PetCare</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarText"
				aria-controls="navbarText" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarText">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="/solicitacoes">Solicitação</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/donos">Dono</a>
					</li>
					<li class="nav-item"><a class="nav-link active" href="/servicos">Serviços</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/consultas">Consulta</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/banhos">Banho</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/tosas">Tosa</a>
					</li>
				</ul>
				<span class="navbar-text"> Cuidando do seu pet </span>
			</div>
		</div>
	</nav>
	<div class="container mt-3">
		<h3>Serviços</h3>

		<div class="my-2">
			<table class="table table-striped table-bordered">
				<thead class="table-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Código</th>
						<th scope="col">Nome</th>
						<th scope="col">Animal</th>
						<th scope="col">Valor</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="servico" items="${lista}">
						<tr>
							<th scope="row">${servico.id}</th>
							<td>${servico.codigo}</td>
							<td>${servico.nome}</td>
							<td>${servico.animal}</td>
							<td>${servico.valor}</td>
							<td class="text-center"><a class="btn btn-sm btn-danger"
								href="/servicos/${servico.id}/excluir"> Excluir </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>