package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public class Pagamento {

	public int codigo;
	public double quantidade;
	public LocalDate data;
	
	@Override
	public String toString() {

		return codigo + ";" + quantidade + ";" + data;
	}
}
