package br.edu.infnet.pagamentos.model.test;

import br.edu.infnet.pagamentos.model.domain.Pagamento;

public class AppImpressao {
	
	private  String mensagem;

	public AppImpressao(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void relatorio(Pagamento pagamento) {
		System.out.println(mensagem);
		pagamento.impressao();
	}
}
