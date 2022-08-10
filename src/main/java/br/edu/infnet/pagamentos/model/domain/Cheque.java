package br.edu.infnet.pagamentos.model.domain;

public class Cheque extends Pagamento{

	private String banco;
	private String agencia;
	private String conta;
	
	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	//defina que uma classe filha tenha o mesmo comportamento do método da mãe.
	@Override
	public String toString() {

		return banco + ";" + agencia + ";" + conta + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#Cheque");
		System.out.println(this);
	}
}
