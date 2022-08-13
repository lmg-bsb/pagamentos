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

		

		<h3>Classe: Cliente</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Telefone</th>
					<th>Endereco</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Joaquim José da Silva Xavier</td>
					<td>21-983857663</td>
					<td>Rio de Janeiro, Fevereiro e Março</td>
				</tr>
				<tr>
					<td>Santos Dumont</td>
					<td>24-2247-5222</td>
					<td>2R. do Encanto, 22 - Centro, Petrópolis - RJ</td>
				</tr>
				<tr>
					<td>Juscelino Kubitschek</td>
					<td>61-3225-9451</td>
					<td>Eixo Monumental - Lado Oeste - Praça do Cruzeiro, Brasília - DF, 70070-300</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
</html>