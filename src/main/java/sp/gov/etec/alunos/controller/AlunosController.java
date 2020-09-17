package sp.gov.etec.alunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import sp.gov.etec.alunos.service.AlunosService;
import sp.gov.etec.alunos.dto.AlunosDto;
import sp.gov.etec.alunos.entity.Alunos;


@Controller
@RequestMapping("/aluno")
public class AlunosController {
	
	
	@Autowired
	AlunosService service;

	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrarAluno(@RequestBody AlunosDto dto) {
	   Alunos alunos = service.cadastrarAlunos(dto);
		return ResponseEntity.status(HttpStatus.OK).body(alunos);
	}

	@GetMapping("/listar")
	public ResponseEntity<?> listarAlunos(AlunosDto dto){
		List<Alunos> alunos = service.buscar();
		return ResponseEntity.status(HttpStatus.OK).body(alunos);
	}

}
