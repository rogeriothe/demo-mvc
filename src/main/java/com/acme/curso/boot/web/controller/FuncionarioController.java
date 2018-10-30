package com.acme.curso.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.acme.curso.boot.domain.Cargo;
import com.acme.curso.boot.domain.Funcionario;
import com.acme.curso.boot.domain.UF;
import com.acme.curso.boot.services.CargoService;
import com.acme.curso.boot.services.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	@Autowired
	private CargoService cargoService;
	
	
	
	@GetMapping("/cadastrar")
	public String cadastrar(Funcionario funcionario)
	{
		//caminho do template
		return "/funcionario/cadastro";
	}
			
	@GetMapping("/listar")
	public String listar(ModelMap model)
	{
		model.addAttribute("funcionarios", funcionarioService.buscarTodos());		
		return "/funcionario/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Funcionario funcionario, RedirectAttributes attr) {
		funcionarioService.salvar(funcionario);
		attr.addFlashAttribute("success", "Funcionário inserido com sucesso.");
		return "redirect:/funcionarios/cadastrar";
		
	}	
		
	@ModelAttribute("cargos")
	public List<Cargo> getCargos(){
		return cargoService.buscarTodos();
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}
	
	
	

}
