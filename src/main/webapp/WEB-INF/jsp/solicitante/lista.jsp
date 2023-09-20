<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		 <meta charset="utf-8">
		 <meta name="viewport" content="width=device-width, initial-scale=1">
		 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
		 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	</head>

	<body>
		<div title="mynavbar">
			<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>
		</div>
	
		<div class="container-fluid mt-3">
			<h3>Listagem de Solicitantes:</h3>
	
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Nome</th>
						<th>CPF</th>
						<th>E-mail</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="s" items="${listaSolicitante}">
						<tr>
							<td>${s.nome}</td>
							<td>${s.cpf}</td>
							<td>${s.email}</td>
							<td><a href="/solicitante/${s.cpf}/excluir">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	
		</div>
	</body>

</html>