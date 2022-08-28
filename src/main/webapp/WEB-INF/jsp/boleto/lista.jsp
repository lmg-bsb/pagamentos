<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Pagamentos</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="/boleto/lista">Boleto</a></li>
				<li class="nav-item"><a class="nav-link" href="/cartao/lista">Cartão</a></li>
				<li class="nav-item"><a class="nav-link" href="/cheque/lista">Cheque</a></li>
				<li class="nav-item"><a class="nav-link" href="/cliente/lista">Cliente</a></li>
				<li class="nav-item"><a class="nav-link" href="/produto/lista">Produto</a></li>
			</ul>
		</div>
	</nav>
	<div class="container mt-3">
		<h2>AppPagamentos</h2>
		<p>Projeto de Gestão de Pagamentos</p>



		<h3>Classe: Boleto</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Código</th>
					<th>Valor</th>
					<th>Data</th>
					<th>nossoNumero</th>
					<th>dataVencimento</th>
					<th>linhaDigitavel</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listagem}" var="b">
					<tr>
						<td>${b.codigo}</td>
						<td>${b.valor}</td>
						<td>${b.data}</td>
						<td>${b.nossoNumero}</td>
						<td>${b.dataVencimento }</td>
						<td>${b.linhaDigitavel}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>