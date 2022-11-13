<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="d-flex flex-row gap-2 form-group mb-3">
	<div class="flex-grow-1">
		<label for="nome" class="form-label">Nome</label> <input
			class="form-control" placeholder="Nome do serviço" name="nome" />
	</div>

	<div>
		<label for="animal" class="form-label">Animal</label> <select
			name="animal" id="animal" class="form-select">
			<option value="Cão">Cão</option>
			<option value="Gato">Gato</option>
			<option value="Camundongo">Camundongo</option>
			<option value="Pássaro">Pássaro</option>
		</select>
	</div>
</div>

<div class="mb-3">
	<label for="valor" class="form-label">Valor</label> <input
		type="number" min="0" step="1" class="form-control" id="valor"
		name="valor">
</div>
