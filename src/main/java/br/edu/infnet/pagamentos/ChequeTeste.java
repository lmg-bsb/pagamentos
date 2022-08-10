package br.edu.infnet.pagamentos;

import java.time.LocalDate;

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
		c1.setCodigo(7);
		c1.setData(LocalDate.now());
		c1.setQuantidade(567890);
		c1.setBanco("001");
		c1.setAgencia("987");
		c1.setConta("2349-0");		
		System.out.println(c1);
		
		Cheque c2 = new Cheque();
		c2.setCodigo(8);
		c2.setData(LocalDate.now());
		c2.setQuantidade(99);
		c2.setBanco("237");
		c2.setAgencia("002");
		c2.setConta("98654-9");		
		System.out.println(c2);
		
		Cheque c3 = new Cheque();
		c3.setCodigo(9);
		c3.setData(LocalDate.now());
		c3.setQuantidade(28);
		c3.setBanco("104");
		c3.setAgencia("3488");
		c3.setConta("730876-1");		
		System.out.println(c3);
	}

}
