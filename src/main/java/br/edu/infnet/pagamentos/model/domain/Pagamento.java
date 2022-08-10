package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public abstract class Pagamento {

	private int codigo;
	private double valor;
	private LocalDate data;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double quantidade) {
		this.valor = quantidade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double valorFinanciado() {
		return valor*10;
	}
	@Override
	public String toString() {

		return codigo + ";" + valor + ";" + data + ";Valor financiado: " + valorFinanciado();
	}
	
	public abstract void impressao();
}
