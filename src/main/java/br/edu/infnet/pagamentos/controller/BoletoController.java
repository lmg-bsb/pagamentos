package br.edu.infnet.pagamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoletoController {

	@GetMapping(value = "/boleto/lista")
	public String telaLista(){
		return "boleto/lista";
	}
}
