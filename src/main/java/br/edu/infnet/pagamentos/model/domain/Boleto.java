package br.edu.infnet.pagamentos.model.domain;

import java.time.LocalDate;

public class Boleto extends Pagamento{

	private String nossoNumero;
	private LocalDate dataVencimento;
	private String linhaDigitavel;
	
	public String getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}

	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}

	//defina que a segunda classe filha tenha um comportamento completamente diferente da mãe.
	@Override
	public double valorFinanciado() {
		
		//Verifica se o boleto está vencido
		double valor = getDataVencimento().compareTo(getData()) < 0?getValor()*2: getValor()*0.9;
		return valor;
	}
	
	@Override
	public String toString() {

		return nossoNumero + ";" + dataVencimento + ";" + linhaDigitavel + ";" + super.toString();
	}
}
