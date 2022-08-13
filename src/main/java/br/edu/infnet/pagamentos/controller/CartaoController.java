package br.edu.infnet.pagamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartaoController {

	@GetMapping(value = "/cartao/lista")
	public String telaLista() {
		return "cartao/lista";
	}
}
