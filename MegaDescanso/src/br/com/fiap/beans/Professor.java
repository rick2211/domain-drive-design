package br.com.fiap.beans;

public class Professor extends Funcionario{

	private long matricula;
	private String apelido;

	public String getAll() {
		return super.getAll() + "\n" + 
				"Matricula: " + matricula + "\n"+
				"Apelido: " + apelido;
	}
	public Professor() {
		super();
	}
	public Professor(String nome, Endereco endereco, int telefone, String email, String rg, String cpf,
			String dataNascimento, char sexo, String cargo, double salario, int cargaHorariaSemanal, long matricula,
			String apelido) {
		super(nome, endereco, telefone, email, rg, cpf, dataNascimento, sexo, cargo, salario, cargaHorariaSemanal);
		setMatricula(matricula);
		setApelido(apelido);
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido.toUpperCase();
	}



}
