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

	@Override
	public String toString() {

		return numero + ";" + cvv + ";" + validade + super.toString();
	}
}
