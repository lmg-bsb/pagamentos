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

		

		<h3>Classe: Cheque</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Código</th>
					<th>Valor</th>
					<th>Data</th>
					<th>Banco</th>
					<th>Agência</th>
					<th>Conta</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>9258</td>
					<td>494857</td>
					<td>2022-08-13</td>
					<td>0001</td>
					<td>1345</td>
					<td>987654-3</td>
				</tr>
				<tr>
					<td>7849</td>
					<td>963282</td>
					<td>2022-08-14</td>
					<td>237</td>
					<td>2399</td>
					<td>730987-7</td>
				</tr>
				<tr>
					<td>0812</td>
					<td>60934</td>
					<td>2022-08-15</td>
					<td>144</td>
					<td>3519</td>
					<td>106066-0</td>
				</tr>
			</tbody>
		</table>

	</div>
</body>
</html>