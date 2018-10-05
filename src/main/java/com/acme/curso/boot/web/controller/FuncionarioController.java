package com.acme.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@GetMapping("/cadastrar")
	public String cadastrar()
	{
		//caminho do template
		return "/funcionario/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar()
	{
		//caminho do template		
		return "/funcionario/lista";
	}

}
