package br.com.fiap.beans;

public class Categoria {
	private int codCategoria;
	private String nomeCategoria;
	private String descricaoCategoria;
	
	
	public String getAll() {
		return 	"Codigo da Categoria:" + codCategoria + "\n" +
				"Nome da Categoria: " + nomeCategoria + "\n" + 
				"Descrição da Categoria: " + descricaoCategoria;
	}
	public void setAll(int codCAtegoria, String nomeCategoria, String descricaoCategoria) {
		setCodCategoria(codCAtegoria);
		setNomeCategoria(nomeCategoria);
		setDescricaoCategoria(descricaoCategoria);
	}
	public Categoria() {
		super();
	}
	public Categoria(int codCategoria, String nomeCategoria, String descricaoCategoria) {
		super();
		setCodCategoria(codCategoria);
		setNomeCategoria(nomeCategoria);
		setDescricaoCategoria(descricaoCategoria);
	}
	
	public int getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
	

}
