package br.edu.infnet.pagamentos;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Boleto;

@Component
public class BoletoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Boleto");
		
		Boleto b1 = new Boleto();
		b1.dataVencimento = LocalDate.now();
		b1.linhaDigitavel = "989843.7593845.345793845.983475.1.98237498";
		b1.nossoNumero = "346768";
		System.out.println(b1);
		
		Boleto b2 = new Boleto();
		b2.dataVencimento = LocalDate.now();
		b2.linhaDigitavel = "98328.3274.928.349324.0.567895678";
		b2.nossoNumero = "102938";
		System.out.println(b2);
		
		Boleto b3 = new Boleto();
		b3.dataVencimento = LocalDate.now();
		b3.linhaDigitavel = "6789.65432.6789.532.6.4567898767100";
		b3.nossoNumero = "2345678";
		System.out.println(b3);
		
	}
}
