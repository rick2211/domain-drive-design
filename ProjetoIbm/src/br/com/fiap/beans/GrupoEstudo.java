package br.com.fiap.beans;

public class GrupoEstudo {
	private int codGrupoEstudos;
	private Categoria categoria;
	private String descricaoGrupo;
	
	public String getAll() {
		return categoria.getAll() + "\n" + 
				"Descrição do Grupo de Estudo: " + descricaoGrupo;
	}
	public void setAll(int codGrupoEstudos, Categoria categoria, String descricaoGrupo) {
		setCodGrupoEstudos(codGrupoEstudos);
		setCategoria(categoria);
		setDescricaoGrupo(descricaoGrupo);
	}

	public GrupoEstudo() {
		super();
	}
	public GrupoEstudo(int codGrupoEstudos, Categoria categoria, String descricaoGrupo) {
		super();
		setCodGrupoEstudos(codGrupoEstudos);
		setCategoria(categoria);
		setDescricaoGrupo(descricaoGrupo);
	}
	
	public int getCodGrupoEstudos() {
		return codGrupoEstudos;
	}
	public void setCodGrupoEstudos(int codGrupoEstudos) {
		this.codGrupoEstudos = codGrupoEstudos;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getDescricaoGrupo() {
		return descricaoGrupo;
	}
	public void setDescricaoGrupo(String descricaoGrupo) {
		this.descricaoGrupo = descricaoGrupo;
	}
	
	

}
