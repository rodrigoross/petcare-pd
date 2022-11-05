<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="/">PetCare</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarText" aria-controls="navbarText"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarText">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<c:if test="${not empty autenticado}">
					<li class="nav-item"><a class="nav-link" href="/usuarios">Usuários</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/solicitacoes">Solicitação</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/donos">Dono</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/servicos">Serviços</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/consultas">Consulta</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/banhos">Banho</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="/tosas">Tosa</a>
					</li>
				</c:if>
			</ul>
			
			<span class="navbar-text me-2"> Sempre cuidando do seu pet </span>

			<ul class="nav navbar-nav navbar-right gap-2">
				<c:if test="${empty autenticado}">
					<li><a href="/cadastrar" class="btn btn-sm btn-light"> <i
							class="bi bi-person-circle"></i> Cadastrar
					</a></li>
					<li><a href="/login" class="btn btn-sm btn-dark"> <i
							class="bi bi-door-open"></i> Login
					</a></li>
				</c:if>

				<c:if test="${not empty autenticado}">
					<li><a href="/logout" class="btn btn-sm btn-outline-secondary">
							<i class="bi bi-door-closed"></i> ${autenticado.nome} Sair
					</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>