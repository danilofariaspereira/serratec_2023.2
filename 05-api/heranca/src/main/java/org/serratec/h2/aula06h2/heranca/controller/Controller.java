package org.serratec.h2.aula06h2.heranca.controller;

import java.util.List;

import org.serratec.h2.aula06h2.heranca.model.Funcionario;
import org.serratec.h2.aula06h2.heranca.repositorio.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> listar() {
		//List <Funcionario> listaFuncionario = funcionarioRepository.findAll();
		return ResponseEntity.ok(funcionarioRepository.findAll);
	}

	
	

}
