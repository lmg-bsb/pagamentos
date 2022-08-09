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
	<div class="container mt-3">
		<h2>AppPagamentos</h2>
		<p>Projeto de Gestão de Pagamentos</p>

		<h3>Classe: Cliente</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nome</td>
					<td>String</td>
					<td>Nome do cliente</td>
				</tr>
				<tr>
					<td>telefone</td>
					<td>String</td>
					<td>Telefone do cliente</td>
				</tr>
				<tr>
					<td>endereco</td>
					<td>String</td>
					<td>Endereço do cliente</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe: Produto</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>descricao</td>
					<td>String</td>
					<td>Descrição do Produto</td>
				</tr>
				<tr>
					<td>peso</td>
					<td>float</td>
					<td>Peso do produto</td>
				</tr>
				<tr>
					<td>preco</td>
					<td>float</td>
					<td>Preço do produto</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe: Pagamento</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>codigo</td>
					<td>int</td>
					<td>Código do pagamento</td>
				</tr>
				<tr>
					<td>quantidade</td>
					<td>float</td>
					<td>Quantidade de dinheiro pago</td>
				</tr>
				<tr>
					<td>data</td>
					<td>LocalDate</td>
					<td>data do pagamento</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe: CartaoCredito</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>numero</td>
					<td>String</td>
					<td>Número do Cartão de Crédito</td>
				</tr>
				<tr>
					<td>validade</td>
					<td>LocalDate</td>
					<td>Data de validade do cartão de crédito</td>
				</tr>
				<tr>
					<td>cvv</td>
					<td>String</td>
					<td>Código de verificação do cartão</td>
				</tr>
			</tbody>
		</table>

		<h3>Classe: Cheque</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>banco</td>
					<td>String</td>
					<td>Número do Banco</td>
				</tr>
				<tr>
					<td>agencia</td>
					<td>String</td>
					<td>Número da agência do banco</td>
				</tr>
				<tr>
					<td>conta</td>
					<td>String</td>
					<td>Número da conta</td>
				</tr>
			</tbody>
		</table>
		
		<h3>Classe: BoletoBancario</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Atributo</th>
					<th>Tipo</th>
					<th>Descrição</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nossoNumero</td>
					<td>String</td>
					<td>Código único que identifica para quem o boleto foi emitido</td>
				</tr>
				<tr>
					<td>dataVencimento</td>
					<td>LocalDate</td>
					<td>Data limite para pagamento do boleto</td>
				</tr>
				<tr>
					<td>linhaDigitavel</td>
					<td>String</td>
					<td>Representação numérica do código de barras</td>
				</tr>
			</tbody>
		</table>
		
	</div>
</body>
</html>