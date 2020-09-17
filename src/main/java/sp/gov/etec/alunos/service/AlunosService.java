package sp.gov.etec.alunos.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sp.gov.etec.alunos.dto.AlunosDto;
import sp.gov.etec.alunos.entity.Alunos;
import sp.gov.etec.alunos.repository.AlunosRepository;

	
	@Service
	public class AlunosService {
		
		@Autowired
		AlunosRepository repository;

		public List<Alunos> buscar(){
			return repository.findAll();	
		}
		
		public Alunos cadastrarAlunos(AlunosDto dto) {
			Alunos aluno = repository.save(dto.toEntityAlunos());
			return aluno;
		}
}



