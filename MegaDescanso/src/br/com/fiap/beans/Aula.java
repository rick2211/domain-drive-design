package br.com.fiap.beans;

public class Aula {
	private int numero;
	private Modalidade modalidade;
	private Sala sala;
	private String dificuldade;
	private String horario;
	private String duracao;

	
	public Aula() {
		super();
	}
	public Aula(int numero, Modalidade modalidade, Sala sala, String dificuldade, String horario, String duracao) {
		super();
		setNumero(numero);
		setModalidade(modalidade);
		setSala(sala);
		setDificuldade(dificuldade);
		setHorario(horario);
		setDuracao(duracao);

	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public String getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade.toUpperCase();
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario.toUpperCase();
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao.toUpperCase();
	}



}
