package br.com.fiap.beans;

public class Frequencia {
	private int seqAula;
	private Aula aula;
	private Aluno aluno;
	private Modalidade modalidade;
	private Professor professor;
	private String dataAula;
	
	
	
	public Frequencia() {
		super();
	}
	public Frequencia(int seqAula, Aula aula, Aluno aluno, Modalidade modalidade, Professor professor,
			String dataAula) {
		super();
		setSeqAula(seqAula);
		setAula(aula);
		setAluno(aluno);
		setModalidade(modalidade);
		setProfessor(professor);
		setDataAula(dataAula);
	}
	public int getSeqAula() {
		return seqAula;
	}
	public void setSeqAula(int seqAula) {
		this.seqAula = seqAula;
	}
	public Aula getAula() {
		return aula;
	}
	public void setAula(Aula aula) {
		this.aula = aula;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getDataAula() {
		return dataAula;
	}
	public void setDataAula(String dataAula) {
		this.dataAula = dataAula.toUpperCase();
	}
	
	
	

}
