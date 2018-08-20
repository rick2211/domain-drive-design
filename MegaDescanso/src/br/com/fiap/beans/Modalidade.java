package br.com.fiap.beans;

public class Modalidade {
	private long codigo;
	private String descricao;
	private String inicio;
	private String termino;
	
	
	public Modalidade() {
		super();
	}
	public Modalidade(long codigo, String descricao, String inicio, String termino) {
		super();
		setCodigo(codigo);
		setDescricao(descricao);
		setInicio(inicio);
		setTermino(termino);
		
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao.toUpperCase();
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio.toUpperCase();
	}
	public String getTermino() {
		return termino;
	}
	public void setTermino(String termino) {
		this.termino = termino.toUpperCase();
	}
	

}
