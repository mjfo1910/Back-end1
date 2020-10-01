package com.helloword.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Atividade1")

public class Atividade_1 {
	
	@GetMapping
	public String HabilidaeMentalidade() {
		return "Utilizei habilidade de atenção aos detalhes e Mentalidade de crescimento ";
	}
	
}








