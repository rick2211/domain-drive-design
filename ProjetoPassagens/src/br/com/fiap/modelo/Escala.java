package br.com.fiap.modelo;

public class Escala {
	private String localidade;
	private String duracao;
	//contrutores vazio
	public Escala() {}
	//construtor cheio
	public Escala(String localidade) {
		this.localidade=localidade;
	}
	
	public Escala(String localidade, String duracao) {
		this.localidade=localidade;
		this.duracao=duracao;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	


}
