package br.edu.infnet.pagamentos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Boleto;
import br.edu.infnet.pagamentos.model.domain.Cartao;
import br.edu.infnet.pagamentos.model.domain.Cheque;
import br.edu.infnet.pagamentos.model.domain.Cliente;
import br.edu.infnet.pagamentos.model.domain.Pagamento;
import br.edu.infnet.pagamentos.model.domain.Produto;
import br.edu.infnet.pagamentos.model.test.AppImpressao;

@Component
public class ProdutoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n###PRODUTOS###");
		
		Boleto b1 = new Boleto();
		b1.setCodigo(1);
		b1.setData(LocalDate.now());
		b1.setValor(9);
		b1.setDataVencimento(LocalDate.of(2022,1,01));
		b1.setLinhaDigitavel("989843.7593845.345793845.983475.1.98237498");
		b1.setNossoNumero("346768");
		
		Cartao crd1 = new Cartao();
		crd1.setCodigo(3);
		crd1.setData(LocalDate.now());
		crd1.setValor(345);
		crd1.setCvv("345");
		crd1.setNumero("9786.1432.0129.4567");
		crd1.setValidade(LocalDate.of(2023, 12, 22));
		
		Cheque ch1 = new Cheque();
		ch1.setCodigo(5);
		ch1.setData(LocalDate.now());
		ch1.setValor(567890);
		ch1.setBanco("001");
		ch1.setAgencia("987");
		ch1.setConta("2349-0");	
		
		Set<Pagamento> lp1 = new HashSet<Pagamento>();
		lp1.add(ch1);
		lp1.add(crd1);		
		Cliente c1 = new Cliente("José", "61-2345678", "Brasília");
		Produto p1 = new Produto(c1);
		p1.setDescricao("Pen Drive");
		p1.setPeso(0.100);
		p1.setPreco(152.37);
		p1.setPagamentos(lp1);
		AppImpressao.relatorio("Inclusão do Produto P1", p1);
		
		
		Set<Pagamento> lp2 = new HashSet<Pagamento>();
		lp2.add(ch1);
		Cliente c2 = new Cliente("Maria", "11-123456789", "São Paulo");
		Produto p2 = new Produto(c2);
		p2.setDescricao("Notebook Dell XPS 13");
		p2.setPeso(1.9);
		p2.setPreco(13000);
		p2.setPagamentos(lp2);
		AppImpressao.relatorio("Inclusão do Produto P2", p2);
		
		
		Set<Pagamento> lp3 = new HashSet<Pagamento>();
		lp3.add(crd1);
		lp3.add(b1);
		lp3.add(ch1);
		lp3.add(ch1);
		Cliente c3 = new Cliente("Tadeu", "98-987654321", "Maranhão");
		Produto p3 = new Produto(c3);
		p3.setDescricao("Celular Xiaomi MI 12 Ultra");
		p3.setPeso(0.2);
		p3.setPreco(5700);
		p3.setPagamentos(lp3);
		AppImpressao.relatorio("Inclusão do Produto P3", p3);
	}
}
