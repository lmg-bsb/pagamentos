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



		<h3>Classe: Produto</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Descrição</th>
					<th>Peso (kg)</th>
					<th>Preço (R$)</th>					
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Filé de Peito de Frango Congelado sem Osso Perdigão 1Kg -
						Sassami</td>
					<td>1</td>
					<td>22.9</td>
				</tr>
				<tr>
					<td>Bombom Nestlé Especialidades</td>
					<td>0.251</td>
					<td>9,39</td>
				</tr>
				<tr>
					<td>Sorvete 3 Chocolates Lacta 1,5 Litros</td>
					<td>1,5</td>
					<td>17,14</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
</html>