package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public class Cartao extends Pagamento{

	private String numero;
	private LocalDate validade;
	private String cvv;
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	//defina que a terceira classe filha tenha o comportamento da mãe com algum complemento específico.
	@Override
	public double valorFinanciado() {
		
		int desconto = getValor() > 100? 20:5;
		// TODO Auto-generated method stub
		return getValor()*10 * (100 - desconto)/100;
	}
	@Override
	public String toString() {

		return numero + ";" + cvv + ";" + validade + ";" + super.toString();
	}


	@Override
	public void impressao() {
		System.out.println("#Cartao");
		System.out.println(this);
	}
}
