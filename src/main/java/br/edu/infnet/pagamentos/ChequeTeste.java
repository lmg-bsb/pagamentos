package br.edu.infnet.pagamentos;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cheque;
import br.edu.infnet.pagamentos.model.test.AppImpressao;

@Component
public class ChequeTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Cheques");
		
		Cheque c1 = new Cheque();
		c1.setCodigo(7);
		c1.setData(LocalDate.now());
		c1.setValor(567890);
		c1.setBanco("001");
		c1.setAgencia("987");
		c1.setConta("2349-0");		
		
		new AppImpressao("Primeiro Cheque").relatorio(c1);
		
		Cheque c2 = new Cheque();
		c2.setCodigo(8);
		c2.setData(LocalDate.now());
		c2.setValor(99);
		c2.setBanco("237");
		c2.setAgencia("002");
		c2.setConta("98654-9");		
		
		new AppImpressao("Segundo Cheque").relatorio(c2);
		
		Cheque c3 = new Cheque();
		c3.setCodigo(9);
		c3.setData(LocalDate.now());
		c3.setValor(28);
		c3.setBanco("104");
		c3.setAgencia("3488");
		c3.setConta("730876-1");		
		
		new AppImpressao("Terceiro Cheque").relatorio(c3);
	}

}
