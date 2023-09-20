<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>AppPedido</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container mt-3">
			<h2>Cadastramento de Usuários</h2>
	
			<form action="/usuario/incluir" method="post">
	
				<div class="mb-3 mt-3">
					<label for="nome">Nome:</label>
					<input type="text" class="form-control" value="Niky Lima" id="nome" placeholder="Entre com o seu nome" name="nome">
				</div>
	
				<div class="mb-3 mt-3">
					<label for="email">E-mail:</label>
					<input type="email" class="form-control" value="niky.lima@al.infnet.edu.br" id="email" placeholder="Entre com o seu e-mail" name="email">
				</div>
	
				<div class="mb-3">
					<label for="pwd">Senha:</label>
					<input type="password" class="form-control" value="niky.lima@al.infnet.edu.br" id="pwd" placeholder="Entre com a sua senha" name="senha">
				</div>
	
				<button type="submit" class="btn btn-primary">Cadastrar</button>
			</form>
		</div>
	</body>
</html>
