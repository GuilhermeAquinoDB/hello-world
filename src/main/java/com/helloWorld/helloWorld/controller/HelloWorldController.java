package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloWorld.helloWorld.model.Bsm;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsms")
	public List<Bsm> listar() {
		
		Bsm bsm1 = new Bsm();
		bsm1.setId(1L);
		bsm1.setNome("Responsabilidade Pessoal");
		bsm1.setTipo("Mentalidades");
		
		Bsm bsm2 = new Bsm();
		bsm2.setId(2L);
		bsm2.setNome("Mentalidade de Crescimento");
		bsm2.setTipo("Mentalidades");
		
		Bsm bsm3 = new Bsm();
		bsm3.setId(3L);
		bsm3.setNome("Orientação para o Futuro");
		bsm3.setTipo("Mentalidades");
		
		Bsm bsm4 = new Bsm();
		bsm4.setId(4L);
		bsm4.setNome("Persistência");
		bsm4.setTipo("Mentalidades");
		
		Bsm bsm5 = new Bsm();
		bsm5.setId(5L);
		bsm5.setNome("Comunicação");
		bsm5.setTipo("Habilidades Comportamentais");
		
		Bsm bsm6 = new Bsm();
		bsm6.setId(6L);
		bsm6.setNome("Trabalho em Equipe");
		bsm6.setTipo("Habilidades Comportamentais");
		
		Bsm bsm7 = new Bsm();
		bsm7.setId(7L);
		bsm7.setNome("Proatividade");
		bsm7.setTipo("Habilidades Comportamentais");
		
		Bsm bsm8 = new Bsm();
		bsm8.setId(8L);
		bsm8.setNome("Orientação ao Detalhe");
		bsm8.setTipo("Habilidades Comportamentais");
		
		return Arrays.asList(bsm1, bsm2, bsm3, bsm4, bsm5, bsm6, bsm7, bsm8);
	}
	
	@GetMapping("/my-list")
	public List<String> myList() {
		String springJPA = new String("Aprender esse framework");
		String relacionamentos = new String("Aprender sobre relacionamentos entre tabelas e como essa comunicação funciona no mundo Java");
		String springSecurity = new String("Aprender essa parte de segunrança da aplicacao");
		
		List<String> listaObj = new ArrayList<>();
		listaObj.add(springJPA);
		listaObj.add(relacionamentos);
		listaObj.add(springSecurity);
		
		return listaObj;
	}
}
