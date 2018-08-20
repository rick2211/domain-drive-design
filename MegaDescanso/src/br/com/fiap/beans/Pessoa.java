package br.com.fiap.beans;

public class Pessoa {

	private String nome;
	private Endereco endereco;
	private int telefone;
	private String email;

	//////	public String metadeEndereco() {
	//////		return endereco.substring(0, endereco.length()/2);
	//		
	//	}

	public String primeiroNome() {
		return nome.substring(0, nome.indexOf(" "));
	}
	public String getAll() {
		return "Nome:" + nome + "\n"  + 
				"Endereço:" + endereco.getAll() + "\n" + 
				"Telefone: " + telefone + "\n" + 
				"Email: " + email;
	}
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, Endereco endereco, int telefone, String email) {
		super();
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setEmail(email);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()<1) {
			this.nome="INVALIDO";
		}else {
			this.nome = nome.toUpperCase();
		}
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.indexOf("@")<0) {
			this.email = "email@administrador.com";
		}else {
		this.email = email.toLowerCase();
		}
	}



}
