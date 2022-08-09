package br.edu.infnet.pagamentos.model.domain;

public class Cheque {

	public String banco;
	public String agencia;
	public String conta;
	
	@Override
	public String toString() {

		return banco + ";" + agencia + ";" + conta;
	}
}
