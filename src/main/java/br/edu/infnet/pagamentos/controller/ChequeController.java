package br.edu.infnet.pagamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChequeController {

	@GetMapping(value = "/cheque/lista")
	public String telaLista() {
		return "cheque/lista";
	}
}
