package br.com.udemy.springbootmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/Departamento/cadastro";
	}
	@GetMapping("/listar")
	public String listar() {
		return "/Departamento/lista";
	}
}
