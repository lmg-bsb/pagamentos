package br.edu.infnet.pagamentos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.pagamentos.model.domain.Boleto;
import br.edu.infnet.pagamentos.model.test.AppImpressao;

@Controller
public class BoletoController {

	private static List<Boleto> boletos = new ArrayList<Boleto>();
	
	public static void incluir(Boleto boleto) {
		boletos.add(boleto);
		AppImpressao.relatorio("Boleto " + boleto.getCodigo() + " incluído com sucesso!", boleto);
	}	
	@GetMapping(value = "/boleto/lista")
	public String telaLista(Model model){		
		model.addAttribute("listagem", boletos);		
		return "boleto/lista";
	}
}
