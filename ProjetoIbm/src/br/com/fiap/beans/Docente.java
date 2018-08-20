package br.com.fiap.beans;

public class Docente extends PessoaFisica {
	private String identificacao;
	private String areaAtuacao;
	
	public String getAll() {
		return super.getAll() + "\n" + 
				"Identificação: " + identificacao + "\n" + 
				"Área de Atuação: " + areaAtuacao;
	}
	public void setAll(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cpf, String rg,
			String dataNascimento, String idioma, String interesse, String identificacao, String areaAtuacao) {
		super.setAll(codUsuario, nomeUsuario, email, fone, senha, endereco, cpf, rg, dataNascimento, idioma, interesse);
		setIdentificacao(identificacao);
		setAreaAtuacao(areaAtuacao);
	}
	public Docente() {
		super();
	}
	public Docente(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cpf, String rg,
			String dataNascimento, String idioma, String interesse, String identificacao, String areaAtuacao) {
		super(codUsuario, nomeUsuario, email, fone, senha, endereco, cpf, rg, dataNascimento, idioma, interesse);
		setIdentificacao(identificacao);
		setAreaAtuacao(areaAtuacao);
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

}
