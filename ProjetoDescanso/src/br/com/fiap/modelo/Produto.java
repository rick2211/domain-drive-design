package br.com.fiap.modelo;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private Fabricante fabricante;
	
	public String aumentar(double porc) {
		valor = valor + valor *(porc/100);
		return "Produto Alterado!";
		
		
	}

	public double getDesconto() {
		return valor-valor*0.1;

	}

	public String getBasico( ) {
		return "Descricao...:" + descricao + "\n"+
				"Valor......:" + valor ;
	}

	public void setBasico(String descricao , double valor) {
		this.descricao=descricao;
		this.valor=valor;
	}

	public void setAll(int codigo, String descricao, double valor, Fabricante fabricante) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.fabricante = fabricante;
	}

	public String getAll() {
		return "Codigo.....: " + codigo + "\n" +
				"Descricao.: " + descricao + "\n" +
				"Valor.....: " + valor + "\n" + 
				"Fabricante: " + fabricante.getAll();
	}
	public Produto () {}
	public Produto (int codigo, String descricao, double valor, Fabricante fabricante) {
		this.codigo=codigo;
		this.descricao=descricao;
		this.valor=valor;
		this.fabricante=fabricante;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;

	}
	public int getCodigo() {
		return codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;

	}
	public void setValor(double valor) {
		this.valor = valor;

	}
	public double getValor() {
		return valor;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}



}
