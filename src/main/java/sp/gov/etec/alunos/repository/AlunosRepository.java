package sp.gov.etec.alunos.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sp.gov.etec.alunos.entity.Alunos;


@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
