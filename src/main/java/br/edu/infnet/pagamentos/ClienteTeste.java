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
		System.out.println("\n#Cliente");
		
		Cliente c1 = new Cliente();
		c1.setEndereco("Brasília");
		c1.setNome("José");
		c1.setTelefone("61-2345678");
		System.out.println(c1);
		AppImpressao.relatorio("Inclusão do Cliente C1", c1);
		
		Cliente c2 = new Cliente();
		c2.setEndereco("São Paulo");
		c2.setNome("Maria");
		c2.setTelefone("11-123456789");
		System.out.println(c2);
		AppImpressao.relatorio("Inclusão do Cliente C2", c2);
		
		Cliente c3 = new Cliente();
		c3.setEndereco("Maranhão");
		c3.setNome("Tadeu");
		c3.setTelefone("98-987654321");
		System.out.println(c3);
		AppImpressao.relatorio("Inclusão do Cliente C3", c3);
	}

}
