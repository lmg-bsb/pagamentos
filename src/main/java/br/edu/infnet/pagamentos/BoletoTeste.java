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
		b1.setCodigo(1);
		b1.setData(LocalDate.now());
		b1.setValor(9);
		b1.setDataVencimento(LocalDate.of(2022,9,07));
		b1.setLinhaDigitavel("989843.7593845.345793845.983475.1.98237498");
		b1.setNossoNumero("346768");
		System.out.println(b1);
		
		Boleto b2 = new Boleto();
		b2.setCodigo(2);
		b2.setData(LocalDate.now());
		b2.setValor(24);
		b2.setDataVencimento(LocalDate.of(2023,12,25));
		b2.setLinhaDigitavel("98328.3274.928.349324.0.567895678");
		b2.setNossoNumero("102938");
		System.out.println(b2);
		
		Boleto b3 = new Boleto();
		b3.setCodigo(3);
		b3.setData(LocalDate.now());
		b3.setValor(15);
		b3.setDataVencimento(LocalDate.of(2024,5,01));
		b3.setLinhaDigitavel("6789.65432.6789.532.6.4567898767100");
		b3.setNossoNumero("2345678");
		System.out.println(b3);
		
	}
}
