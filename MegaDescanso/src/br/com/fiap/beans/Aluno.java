package br.com.fiap.beans;

public class Aluno extends PFisica{
	
	private long matricula;
	private Instituicao instituicao;
	private String dataMatricula;
	
	
	public double calcularMensalidade(double valor) {
		if (instituicao != null) {
			return valor-(valor*(instituicao.getDesconto()/100));
		} else {
			return valor;
		}
	}
	public String getAll() {
		return super.getAll() + "\n" +
				"Matricula : " + matricula + "\n" + 
				"Instituicao: " + instituicao.getAll() +
				"Data Matricula: " + dataMatricula;
	}
	
	public Aluno() {
		super();
	}
	public Aluno(String nome, Endereco endereco, int telefone, String email, String rg, String cpf,
			String dataNascimento, char sexo, long matricula, Instituicao instituicao, String dataMatricula) {
		super(nome, endereco, telefone, email, rg, cpf, dataNascimento, sexo);
		setMatricula(matricula);
		setInstituicao(instituicao);
		setDataMatricula(dataMatricula);
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula.toUpperCase();
	}
	
	

}
