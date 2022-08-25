package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;
import java.util.Objects;

import br.edu.infnet.pagamentos.interfaces.IPrinter;

public abstract class Pagamento implements IPrinter {

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

//	public double valorFinanciado() {
//		return valor*10;
//	}
	
	public abstract double valorFinanciado();
	
	@Override
	public String toString() {

		return codigo + ";" + valor + ";" + data + ";Valor financiado: " + valorFinanciado();
	}

	@Override
	public void impressao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Pagamento other = (Pagamento) obj;
		return codigo == other.codigo;
	}
	
}
