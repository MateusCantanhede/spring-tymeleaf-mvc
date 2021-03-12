package br.com.udemy.springbootmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/funcionarios")
	public class FuncionarioController {
		
		@GetMapping("/cadastrar")
		public String cadastrar() {
			return "/Funcionario/cadastro";
		}
		@GetMapping("/listar")
		public String listar() {
			return "/Funcionario/lista";
		}
	}

