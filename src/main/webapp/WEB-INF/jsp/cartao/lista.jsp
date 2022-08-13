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

		

		<h3>Classe: Cartao</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Código</th>
					<th>Valor</th>
					<th>Data</th>
					<th>Número</th>
					<th>Validade</th>
					<th>CVV</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1609</td>
					<td>24565</td>
					<td>2022-06-13</td>
					<td>0937.8473.9871.6781</td>
					<td>2025-12-31</td>
					<td>962</td>
				</tr>
				<tr>
					<td>2806</td>
					<td>9678</td>
					<td>2023-01-05</td>
					<td>9384.0987.6574.2389</td>
					<td>2024-12-13</td>
					<td>298</td>
				</tr>
				<tr>
					<td>2050</td>
					<td>546789</td>
					<td>2022-10-24</td>
					<td>9038.8275.8736.0909</td>
					<td>2022-12-25</td>
					<td>690</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
</html>