package br.com.fiap.beans;

public class Usuario {
	private int codUsuario;
	private String nomeUsuario;
	private String email;
	private String fone;
	private String senha;
	private String endereco;
	
	public String getALL() {
		return "Codigo do Usuario: " + codUsuario + "\n" +
				"Nome do Usuario: " + nomeUsuario + "\n"+
				"Email: " + email + "\n"+
				"Fone: " + fone + "\n" +
				"Senha: " + senha + "\n" +
				"Endereço :" + endereco;
	
	}
	public void setAll(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco) {
		setCodUsuario(codUsuario);
		setNomeUsuario(nomeUsuario);
		setEmail(email);
		setFone(fone);
		setSenha(senha);
		setEndereco(endereco);
	}
	public Usuario() {
		super();
	}
	public Usuario(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco) {
		super();
		setCodUsuario(codUsuario);
		setNomeUsuario(nomeUsuario);
		setEmail(email);
		setFone(fone);
		setSenha(senha);
		setEndereco(endereco);
	}
	public int getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		if (nomeUsuario.length() > 20) {
			nomeUsuario = nomeUsuario.substring(0, 20);
		}this.nomeUsuario = nomeUsuario.toUpperCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if (email.indexOf("@") <0 || email.indexOf(".") <0) {
			email = "email@fiap.com.br";
		}	
		this.email = email.toLowerCase();	
	}

	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	

}
