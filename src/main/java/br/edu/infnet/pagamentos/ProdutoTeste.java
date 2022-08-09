package br.edu.infnet.pagamentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Produto;

@Component
public class ProdutoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Produto");
		
		Produto p1 = new Produto();
		p1.descricao = "Pen Drive";
		p1.peso = 0.100;
		p1.preco = 152.37;
		System.out.println(p1);
		
		Produto p2 = new Produto();
		p2.descricao = "Notebook Dell XPS 13";
		p2.peso = 1.9;
		p2.preco = 13000;
		System.out.println(p2);
		
		Produto p3 = new Produto();
		p3.descricao = "Celular Xiaomi MI 12 Ultra";
		p3.peso = 0.2;
		p3.preco = 5700;
		System.out.println(p3);
	}

}
