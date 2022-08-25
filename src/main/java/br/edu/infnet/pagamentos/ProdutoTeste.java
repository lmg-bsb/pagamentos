package br.edu.infnet.pagamentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cliente;
import br.edu.infnet.pagamentos.model.domain.Produto;
import br.edu.infnet.pagamentos.model.test.AppImpressao;

@Component
public class ProdutoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n###PRODUTOS###");
		
		Cliente c1 = new Cliente("José", "61-2345678", "Brasília");
		Produto p1 = new Produto(c1);
		p1.setDescricao("Pen Drive");
		p1.setPeso(0.100);
		p1.setPreco(152.37);
		AppImpressao.relatorio("Inclusão do Produto P1", p1);
		
		Cliente c2 = new Cliente("Maria", "11-123456789", "São Paulo");
		Produto p2 = new Produto(c2);
		p2.setDescricao("Notebook Dell XPS 13");
		p2.setPeso(1.9);
		p2.setPreco(13000);
		AppImpressao.relatorio("Inclusão do Produto P2", p2);
		
		Cliente c3 = new Cliente("Tadeu", "98-987654321", "Maranhão");
		Produto p3 = new Produto(c3);
		p3.setDescricao("Celular Xiaomi MI 12 Ultra");
		p3.setPeso(0.2);
		p3.setPreco(5700);
		AppImpressao.relatorio("Inclusão do Produto P3", p3);
	}
}
