package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private int numero;
	private int qtdEstrelas;
	
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, int numero, int qtdEstrelas) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.qtdEstrelas = qtdEstrelas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdEstrelas() {
		return qtdEstrelas;
	}
	public void setQtdEstrelas(int qtdEstrelas) {
		this.qtdEstrelas = qtdEstrelas;
	}

}
