package br.com.fiap.beans;

public class Prof_Modalidade {
	private Professor professor;
	private Modalidade modalidade;
	private String dataApto;
	
	
	public Prof_Modalidade() {
		super();
	}
	public Prof_Modalidade(Professor professor, Modalidade modalidade, String dataApto) {
		super();
		setProfessor(professor);
		setModalidade(modalidade);
		setDataApto(dataApto);
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public String getDataApto() {
		return dataApto;
	}
	public void setDataApto(String dataApto) {
		this.dataApto = dataApto.toUpperCase();
	}
	
	
	

}
