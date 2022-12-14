package br.edu.infnet.pagamentos;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cartao;
import br.edu.infnet.pagamentos.model.test.AppImpressao;

@Component
public class CartaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n###CARTÕES###");
	
		Cartao c1 = new Cartao();
		c1.setCodigo(4);
		c1.setData(LocalDate.now());
		c1.setValor(345);
		c1.setCvv("345");
		c1.setNumero("9786.1432.0129.4567");
		c1.setValidade(LocalDate.of(2023, 12, 22));

		AppImpressao.relatorio("Primeiro cartão", c1);
		
		Cartao c2 = new Cartao();
		c2.setCodigo(5);
		c2.setData(LocalDate.now());
		c2.setValor(7);
		c2.setCvv("908");
		c2.setNumero("9876.1234.8475.0987");
		c2.setValidade(LocalDate.of(2029, 01, 01));
		
		AppImpressao.relatorio("Segundo cartão", c2);
		
		Cartao c3 = new Cartao();
		c3.setCodigo(6);
		c3.setData(LocalDate.now());
		c3.setValor(43);
		c3.setCvv("222");
		c3.setNumero("0909.7654.1212.3456");
		c3.setValidade(LocalDate.of(2050, 06, 28));
		
		AppImpressao.relatorio("Terceiro cartão", c3);
	}
}
