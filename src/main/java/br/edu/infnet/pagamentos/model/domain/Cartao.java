package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public class Cartao {

	public String numero;
	public LocalDate validade;
	public String cvv;
	
	@Override
	public String toString() {

		return numero + ";" + cvv + ";" + validade;
	}
}
