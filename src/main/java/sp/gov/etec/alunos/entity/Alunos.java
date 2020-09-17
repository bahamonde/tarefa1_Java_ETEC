package sp.gov.etec.alunos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Alunos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "nome", nullable = false, length = 100, unique = true)
	private String nome;
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	@Column(name = "data_nasc", nullable = false)
	private Date data_nasc;
	@Column(name = "matricula", length = 15)
	private String matricula;
	@Column(name = "rg", length = 15)
	private String rg;
	@Column(name = "cpf", length = 18)
	private String cpf;
	
	public Alunos() {
	}

	public Alunos(String nome, String email, Date data_nasc, String matricula, String rg, String cpf) {
		this.nome = nome;
		this.email = email;
		this.data_nasc = data_nasc;
		this.matricula = matricula;
		this.rg = rg;
		this.cpf = cpf;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

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
	
		
	
}
	
	