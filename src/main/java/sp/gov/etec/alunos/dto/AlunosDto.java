package sp.gov.etec.alunos.dto;

import java.io.Serializable;
import java.util.Date;

import sp.gov.etec.alunos.entity.Alunos;


public class AlunosDto implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String email;
	private Date data_nasc;
	private String matricula;
	private String rg;
	private String cpf;


	
	
	
	public String getNome() {
		return nome;
	}
	

public void setNome(String nome) {
	this.nome = nome;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public Date getData_nasc() {
	return data_nasc;
}



public void setData_nasc(Date data_nasc) {
	this.data_nasc = data_nasc;
}



public String getMatricula() {
	return matricula;
}



public void setMatricula(String matricula) {
	this.matricula = matricula;
}



public String getRg() {
	return rg;
}



public void setRg(String rg) {
	this.rg = rg;
}



public String getCpf() {
	return cpf;
}



public void setCpf(String cpf) {
	this.cpf = cpf;
}



public Alunos toEntityAlunos() {
	Alunos alunos = new Alunos(nome, email, data_nasc, matricula,rg,cpf);
	return alunos;

}

}
