package br.edu.infnet.pagamentos.model.domain;

public class Cliente {

	public String nome;
	public String telefone;
	public String endereco;
	
	@Override
	public String toString() {

		return nome + ";" + telefone + ";" + endereco;
	}
}
