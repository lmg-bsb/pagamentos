package br.edu.infnet.pagamentos;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cartao;

@Component
public class CartaoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Cartão");
	
		Cartao c1 = new Cartao();
		c1.cvv = "345";
		c1.numero = "9786.1432.0129.4567";
		c1.validade = LocalDate.of(2023, 12, 22);
		System.out.println(c1);
		
		Cartao c2 = new Cartao();
		c2.cvv = "908";
		c2.numero = "9876.1234.8475.0987";
		c2.validade = LocalDate.of(2029, 01, 01);
		System.out.println(c2);
		
		Cartao c3 = new Cartao();
		c3.cvv = "222";
		c3.numero = "0909.7654.1212.3456";
		c3.validade = LocalDate.of(2050, 06, 28);
		System.out.println(c3);
	}
}
