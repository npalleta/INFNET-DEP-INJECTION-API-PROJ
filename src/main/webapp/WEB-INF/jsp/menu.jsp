<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/">AppPedido</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/solicitante/lista">Solicitantes</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Produtos</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Bebidas</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Comidas</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Sobremesas</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Pedidos</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;Sign&nbsp;Up</a></li>
			<c:choose>
				<c:when test="${not empty username.nome}">
					<li><a href="/login" onclick="return false;"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;Login:&nbsp;${username.nome}</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;Login</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</nav>