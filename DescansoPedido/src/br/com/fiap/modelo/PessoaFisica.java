package br.com.fiap.modelo;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	private String nascimento;
	private String estadoCivil;
	
	public String getAll(){
		return super.getAll() + "\n" + cpf + "\n" + rg + "\n"+ nascimento+ "\n" + estadoCivil;
	}
	public void setAll(String nome, String email, String login, String senha, int qtdEstrelas, String cpf, String rg,
			String nascimento, String estadoCivil) {
		super.setAll(nome, email, login, senha, qtdEstrelas);
		setCpf(cpf);
		setRg(rg);
		setNascimento(nascimento);
		setEstadoCivil(estadoCivil);
	}
	
	public PessoaFisica() {
		super();
	}
	
	
	public PessoaFisica(String nome, String email, String login, String senha, int qtdEstrelas, String cpf, String rg,
			String nascimento, String estadoCivil) {
		super(nome, email, login, senha, qtdEstrelas);
		setCpf(cpf);
		setRg(rg);
		setNascimento(nascimento);
		setEstadoCivil(estadoCivil);
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
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	

}
