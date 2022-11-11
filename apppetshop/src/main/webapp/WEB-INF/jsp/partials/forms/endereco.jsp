<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

	<div class="mb-3">
		<label for="nome" class="form-label">Logradouro</label>
		<input type="text" class="form-control" id="logradouro" value="${endereco.logradouro}"
			name="endereco.logradouro">
	</div>
	<div class="mb-3">
		<label for="nome" class="form-label">Bairro</label>
		<input type="text" class="form-control" id="bairro" value="${endereco.bairro}" name="endereco.bairro">
	</div>
	<div class="mb-3">
		<label for="nome" class="form-label">CEP</label>
		<input type="text" class="form-control" id="cep" value="${endereco.cep}" name="endereco.cep">
	</div>
	<div class="mb-3">
		<label for="nome" class="form-label">Complemento</label>
		<input type="text" class="form-control" id="complemento" value="${endereco.complemento}"
			name="endereco.complemento">
	</div>
	<div class="mb-3">
		<label for="nome" class="form-label">Localidade</label>
		<input type="text" class="form-control" id="localidade" value="${endereco.localidade}"
			name="endereco.localidade">
	</div>
	<div class="mb-3">
		<label for="nome" class="form-label">UF</label>
		<input type="text" class="form-control" id="uf" value="${endereco.uf}" name="endereco.uf">
	</div>