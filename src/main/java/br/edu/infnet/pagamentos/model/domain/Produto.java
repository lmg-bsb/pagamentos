package br.edu.infnet.pagamentos.model.domain;

import br.edu.infnet.pagamentos.interfaces.IPrinter;

public class Produto implements IPrinter{

	private String descricao;
	private double peso;
	private double preco;
	private Cliente cliente;
	
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
	
	@Override
	public void impressao() {
		System.out.println("#Cliente");
		System.out.println(this);		
	}
//	public void impressao() {
//		System.out.println("#Produto");
//		System.out.println(this);
//	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
