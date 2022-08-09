package br.edu.infnet.pagamentos;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Pagamento;

@Component
public class PagamentoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Pagamento");
		
		Pagamento p1 = new Pagamento();
		p1.codigo = 1;
		p1.data = LocalDate.now();
		p1.quantidade = 3;
		System.out.println(p1);
		
		Pagamento p2 = new Pagamento();
		p2.codigo = 2;
		p2.data = LocalDate.now();
		p2.quantidade = 45;
		System.out.println(p2);
		
		Pagamento p3 = new Pagamento();
		p3.codigo = 3;
		p3.data = LocalDate.now();
		p3.quantidade = 768;
		System.out.println(p3);
		
	}

}
