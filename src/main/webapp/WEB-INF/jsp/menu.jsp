<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/">AppPedido</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="/">Home</a></li>
			<c:if test="${not empty user}">
				<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuários</a></li>
				<li class="nav-item"><a class="nav-link" href="/solicitante/lista">Solicitantes</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Produtos</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Bebidas</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Comidas</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Sobremesas</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Pedidos</a></li>
			</c:if>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<c:choose>
				<c:when test="${empty user}">
					<li><a href="/usuario/cadastro"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;Sign&nbsp;Up</a></li>
					<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;Login</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span>&nbsp;&nbsp;Logout:&nbsp;${user.nome}</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</nav>