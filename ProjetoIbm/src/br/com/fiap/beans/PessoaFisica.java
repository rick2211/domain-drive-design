package br.com.fiap.beans;

public class PessoaFisica extends Usuario {
	
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String idioma;
	private String interesse;
	
	public String getAll() {
		return super.getALL() + "\n" +
				"CPF: " + cpf + "\n" + 
				"RG: "  + rg + "\n" + 
				"Date de Nascimento: " + dataNascimento + "\n" +
				"Idioma: " + idioma + "\n" +
				"Interesse: " + interesse;
				
	}
	
	public void setAll(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cpf,
			String rg, String dataNascimento, String idioma, String interesse) {
		super.setAll(codUsuario, nomeUsuario, email, fone, senha, endereco);
		setCpf(cpf);
		setRg(rg);
		setDataNascimento(dataNascimento);
		setIdioma(idioma);
		setInteresse(interesse);
	}
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cpf,
			String rg, String dataNascimento, String idioma, String interesse) {
		super(codUsuario, nomeUsuario, email, fone, senha, endereco);
		setCpf(cpf);
		setRg(rg);
		setDataNascimento(dataNascimento);
		setIdioma(idioma);
		setInteresse(interesse);
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getInteresse() {
		return interesse;
	}
	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}
	
	

}
