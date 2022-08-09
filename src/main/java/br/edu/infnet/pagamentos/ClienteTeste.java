package br.edu.infnet.pagamentos;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.pagamentos.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("\n#Cliente");
		
		Cliente c1 = new Cliente();
		c1.endereco = "Brasília";
		c1.nome = "José";
		c1.telefone = "61-2345678";
		System.out.println(c1);
		
		Cliente c2 = new Cliente();
		c2.endereco = "São Paulo";
		c2.nome = "Maria";
		c2.telefone="11-123456789";
		System.out.println(c2);
		
		Cliente c3 = new Cliente();
		c3.endereco = "Maranhão";
		c3.nome = "Tadeu";
		c3.telefone = "98-987654321";
		System.out.println(c3);
		
	}

}
