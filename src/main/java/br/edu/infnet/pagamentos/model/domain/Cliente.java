package br.edu.infnet.pagamentos.model.domain;

import br.edu.infnet.pagamentos.interfaces.IPrinter;

public class Cliente implements IPrinter{

	private String nome;
	private String telefone;
	private String endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return nome + ";" + telefone + ";" + endereco;
	}

	@Override
	public void impressao() {
		System.out.println("#Cliente");
		System.out.println(this);		
	}
	
//	public void impressao() {
//		System.out.println("#Cliente");
//		System.out.println(this);
//	}
}
