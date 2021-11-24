package br.spring.aula.drogaria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drogaria")
public class DrogariaController {
  
	@RequestMapping("/ola")
	 private String exibirMesagem() {
		 return "Hello World!";
		 
		 
	 }
	
}
