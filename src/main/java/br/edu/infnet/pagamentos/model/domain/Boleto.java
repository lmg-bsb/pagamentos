package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public class Boleto {

	public String nossoNumero;
	public LocalDate dataVencimento;
	public String linhaDigitavel;
	
	@Override
	public String toString() {

		return nossoNumero + ";" + dataVencimento + ";" + linhaDigitavel;
	}
}
