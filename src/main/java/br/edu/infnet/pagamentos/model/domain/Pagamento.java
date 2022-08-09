package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public class Pagamento {

	private int codigo;
	private double quantidade;
	private LocalDate data;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {

		return codigo + ";" + quantidade + ";" + data;
	}
}
