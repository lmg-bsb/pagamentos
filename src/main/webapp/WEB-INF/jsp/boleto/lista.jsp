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
				<tr>
					<td>0001</td>
					<td>28</td>
					<td>2022-08-13</td>
					<td>09485034345</td>
					<td>2022-12-13</td>
					<td>00190500954014481606906809350314337370000000100</td>
				</tr>
				<tr>
					<td>0023</td>
					<td>2098</td>
					<td>2023-04-05</td>
					<td>43509845774</td>
					<td>2024-12-13</td>
					<td>14490500954014481606906809383982176420000010000</td>
				</tr>
				<tr>
					<td>0987</td>
					<td>2589</td>
					<td>2022-12-24</td>
					<td>29385783388</td>
					<td>2022-12-25</td>
					<td>23790912300070920651096809383982176420000000002</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
</html>