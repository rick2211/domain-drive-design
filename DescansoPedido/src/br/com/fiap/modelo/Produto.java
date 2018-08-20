package br.com.fiap.modelo;

public class Produto {
	private String descricao;
	private double valor;
	private int codigo;
	
	public String getResumo() {
	
		return descricao.substring(0, descricao.length()/2);
	}
	
	public void aumentar(double porce) {
		valor = valor +valor * (porce/100);
		
	}
	
	public void setAll(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	
	public String getAll() {
		return "Descrição : " + descricao + "\n" + "Valor  : " + valor + "\n" + "Código : " + codigo;
	
	}	
	public Produto() {
		super();
	}
	public Produto(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if (valor < 1) 
			valor = 0;
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if (codigo <1) {
			codigo = 1;
		}
		this.codigo = codigo;
	}
	
	
	
	
	
	

}
