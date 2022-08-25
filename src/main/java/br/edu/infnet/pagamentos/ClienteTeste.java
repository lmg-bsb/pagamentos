package br.edu.infnet.pagamentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cliente;
import br.edu.infnet.pagamentos.model.test.AppImpressao;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n###CLIENTES###");
		
		Cliente c1 = new Cliente("José", "61-2345678", "Brasília");
		System.out.println(c1);
		AppImpressao.relatorio("Inclusão do Cliente C1", c1);
		
		Cliente c2 = new Cliente("Maria", "11-123456789", "São Paulo");
		System.out.println(c2);
		AppImpressao.relatorio("Inclusão do Cliente C2", c2);
		
		Cliente c3 = new Cliente("Tadeu", "98-987654321", "Maranhão");
		System.out.println(c3);
		AppImpressao.relatorio("Inclusão do Cliente C3", c3);
	}

}
