package br.com.fiap.beans;

public class Sala {
	private int numeroSala;
	private String andar;
	private int sqSala;
	private int capacidade;
	private String observacao;
	
	
	public Sala(int numeroSala, String andar, int sqSala, int capacidade, String observacao) {
		super();
		setNumeroSala(numeroSala);
		setAndar(andar);
		setSqSala(sqSala);;
		setCapacidade(capacidade);
		setObservacao(observacao);
		
	}	
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar.toUpperCase();
	}
	public int getSqSala() {
		return sqSala;
	}
	public void setSqSala(int sqSala) {
		this.sqSala = sqSala;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao.toUpperCase();
	}
	
	

}
