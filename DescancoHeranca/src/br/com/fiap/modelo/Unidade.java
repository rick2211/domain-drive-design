package br.com.fiap.modelo;

public class Unidade {
	private String nome;
	private String fone;
	private String email;


	public String getAll() {
		
		return "Nome: " + nome + "\n " +
				"Fone :" + fone + "\n" +
				"Email :" + email;
	}
	public void setAll(String nome, String fone, String email) {

		setNome(nome);
		setFone(fone);
		setEmail(email);

	}

	public Unidade() {

	}
	public Unidade(String nome, String fone, String email) {

		setNome(nome);
		setFone(fone);
		setEmail(email);

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 20) {
			nome = nome.substring(0, 20);
		}this.nome = nome.toUpperCase();
			
		
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
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



}
