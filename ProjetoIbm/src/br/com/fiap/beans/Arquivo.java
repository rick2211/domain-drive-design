package br.com.fiap.beans;

public class Arquivo {
	private int codArquivo;
	private String descricacaoArquivo;
	
	public String getAll() {
		return "C�digo do Arquivo: " + codArquivo + "\n" + "Desrcri��o do Arquivo: " + descricacaoArquivo;
	}
	public void setAll(int codArquivo, String descricacaoArquivo) {
		setCodArquivo(codArquivo);
		setDescricacaoArquivo(descricacaoArquivo);
	}

	public Arquivo() {
		super();
	}

	public Arquivo(int codArquivo, String descricacaoArquivo) {
		super();
		setCodArquivo(codArquivo);
		setDescricacaoArquivo(descricacaoArquivo);
	}
	
	public int getCodArquivo() {
		return codArquivo;
	}
	public void setCodArquivo(int codArquivo) {
		this.codArquivo = codArquivo;
	}
	public String getDescricacaoArquivo() {
		return descricacaoArquivo;
	}

	public void setDescricacaoArquivo(String descricacaoArquivo) {
		this.descricacaoArquivo = descricacaoArquivo;
	}

}
