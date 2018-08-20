package br.com.fiap.beans;

public class Conta {
	private String numero;
	private double saldo;

	public String getAll() {
		return numero + "\n" + saldo;
	}

	public void setAll(String numero, double saldo) {
		setNumero(numero);
		setSaldo(saldo);
	}

	public Conta() {
		super();
	}
	public Conta(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
