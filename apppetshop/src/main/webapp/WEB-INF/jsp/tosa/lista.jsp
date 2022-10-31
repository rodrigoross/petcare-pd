<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
<title>Cadastramento de tosas</title>

</head>
<body>
	<div class="container mt-3">
		<h3>Tosas</h3>
		
		<div class="my-2">
			<table class="table table-striped table-bordered">
				<thead class="table-light">
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Estilo</th>
						<th scope="col">Higiênica</th>
						<th scope="col">Garras</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="tosa" items="${lista}">
						<tr>
							<th scope="row">${tosa.id}</th>
							<td>${tosa.estilo}</td>
							<td>${tosa.higienica}</td>
							<td>${tosa.aparar}</td>
							<td class="text-center">
								<a class="btn btn-sm btn-danger"
									href="/tosas/${tosa.id}/excluir">
									Excluir 
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>