package br.edu.infnet.pagamentos.model.domain;

import java.util.Set;

import br.edu.infnet.pagamentos.interfaces.IPrinter;

public class Produto implements IPrinter{

	private String descricao;
	private double peso;
	private double preco;
	private Cliente cliente;
	private Set<Pagamento> pagamentos;
	
	public Produto(Cliente cliente) {
		this.cliente = cliente;
	}
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
		return descricao + "; " + peso + "; " + preco + "; " + cliente + "; " + pagamentos.size() + " pagamento(s)";
	}
	
	@Override
	public void impressao() {
		System.out.println("#Cliente");
		System.out.println(this);		
	}
	public Set<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public void setPagamentos(Set<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
}
