package br.com.fiap.beans;

public class Funcionario extends PFisica{
	private String cargo;
	private double salario;
	private int cargaHorariaSemanal;
	
	
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, Endereco endereco, int telefone, String email, String rg, String cpf,
			String dataNascimento, char sexo, String cargo, double salario, int cargaHorariaSemanal) {
		super(nome, endereco, telefone, email, rg, cpf, dataNascimento, sexo);
		setCargo(cargo);
		setSalario(salario);
		setCargaHorariaSemanal(cargaHorariaSemanal);
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo.toUpperCase();
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}
	public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	
	

}
