package br.com.fiap.modelo;

public class Cliente {
	private String nome;
	private String email;
	private String login;
	private String senha;
	private int qtdEstrelas;

	public String getPrimeiroNome() {
		if (nome.indexOf(" ")>=0) {
			return nome.substring(0, nome.indexOf(" "));
		}
		return nome;
	}

	public String getServer() {
		if (email.indexOf("@")>=0) {

			return email.substring(email.indexOf("@")+1);
		}
		return email;
	}

	public String getUser() {

		if (email.indexOf("@")>=0) {
			return email.substring(0,email.indexOf("@"));
		}
		return email;
	}


	public void setAll(String nome, String email, String login, String senha, int qtdEstrelas) {
		setNome(nome);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
		setQtdEstrelas(qtdEstrelas);

	}
	public String getAll() {
		return "Nome: " + nome + "\n" + "Email : " + email + "\n" + "Login : " + login + "\n" + "Senha : " + senha + "\n" + "Quantidade de estrelas : " + qtdEstrelas;
	}
	public Cliente() {
		super();
	}
	public Cliente(String nome, String email, String login, String senha, int qtdEstrelas) {

		setNome(nome);
		setEmail(email);
		setLogin(login);
		setSenha(senha);
		setQtdEstrelas(qtdEstrelas);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {


		if(email.indexOf("@") <2 || email.indexOf(".")<2 || email.length()>80){
			email = "email@fiap.com.br";
		}


		this.email = email.toLowerCase();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		if(login.length()<8 || login.length()>15) {
			login = "";
		}
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha.length()<8 || senha.length()>15) {
			senha = "xxxxxx";
		}
		this.senha = senha;
	}
	public int getQtdEstrelas() {
		return qtdEstrelas;
	}
	public void setQtdEstrelas(int qtdEstrelas) {

		if(qtdEstrelas >5 || qtdEstrelas<1) {
			qtdEstrelas = 1;
		}
		this.qtdEstrelas = qtdEstrelas;
	}



}
