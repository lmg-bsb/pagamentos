package br.edu.infnet.pagamentos.model.test;

import br.edu.infnet.pagamentos.model.domain.Pagamento;

public class AppPagamento {
	
	private  String mensagem;

	public AppPagamento(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void relatorio(Pagamento pagamento) {
		System.out.println(mensagem);
		pagamento.impressao();
	}
}
