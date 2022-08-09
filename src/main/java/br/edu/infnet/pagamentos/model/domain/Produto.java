package br.edu.infnet.pagamentos.model.domain;

public class Produto {

	public String descricao;
	public double peso;
	public double preco;
	
	@Override
	public String toString() {

		return descricao + ";" + peso + ";" + preco;
	}
}
