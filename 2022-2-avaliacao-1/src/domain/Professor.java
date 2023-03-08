package domain;

import persistence.DisciplinaList;

public class Professor {
	private String matricula;
	private String nome;
	private String telefone;
	Disciplina disciplina;
	
	public Professor() {
		
	}
	public Professor(String matricula, String nome, String telefone, String disciplina) {
		setMatricula(matricula);
		setNome(nome);
		setTelefone(telefone);
		setDisciplina(disciplina);
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String codigo) {
		setDisciplina(DisciplinaList.procurar(codigo));
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
}
