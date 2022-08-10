package br.edu.infnet.pagamentos.model.domain;

public class Produto {

	private String descricao;
	private double peso;
	private double preco;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return descricao + ";" + peso + ";" + preco;
	}
	public void impressao() {
		System.out.println("#Produto");
		System.out.println(this);
	}
}
