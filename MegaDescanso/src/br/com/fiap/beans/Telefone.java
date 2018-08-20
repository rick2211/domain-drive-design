package br.com.fiap.beans;

public class Telefone {
	private int ddd;
	private long numero;
	
	
	public Telefone() {
		super();
	}
	public Telefone(int ddd, long numero) {
		super();
		setDdd(ddd);
		setNumero(numero);
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	
	
	

}
