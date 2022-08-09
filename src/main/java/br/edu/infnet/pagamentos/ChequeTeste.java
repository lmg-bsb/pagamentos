package br.edu.infnet.pagamentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cheque;

@Component
public class ChequeTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Cheque");
		
		Cheque c1 = new Cheque();
		c1.banco = "001";
		c1.agencia = "987";
		c1.conta = "2349-0";		
		System.out.println(c1);
		
		Cheque c2 = new Cheque();
		c2.banco = "237";
		c2.agencia = "002";
		c2.conta = "98654-9";		
		System.out.println(c2);
		
		Cheque c3 = new Cheque();
		c3.banco = "104";
		c3.agencia = "3488";
		c3.conta = "730876-1";		
		System.out.println(c3);
	}

}
