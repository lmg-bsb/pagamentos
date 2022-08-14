package br.edu.infnet.pagamentos.model.test;

import br.edu.infnet.pagamentos.interfaces.IPrinter;

public class AppImpressao {
		
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
	}
}
