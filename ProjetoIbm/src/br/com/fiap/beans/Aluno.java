package br.com.fiap.beans;

public class Aluno extends PessoaFisica {
	private int anoLetivo;
	private String curso;
	
	public String getAll() {
		return super.getALL()+ "\n"+
				"Ano Letivo: " + anoLetivo + "\n" +
				"Curso: "+ curso;
	}
	public void setAll(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cpf, String rg,
			String dataNascimento, String idioma, String interesse, int anoLetivo, String curso) {
		super.setAll(codUsuario, nomeUsuario, email, fone, senha, endereco, cpf, rg, dataNascimento, idioma, interesse);
		setAnoLetivo(anoLetivo);
		setCurso(curso);
	}
	public Aluno() {
		super();
	}
	public Aluno(int codUsuario, String nomeUsuario, String email, String fone, String senha, String endereco, String cpf, String rg,
			String dataNascimento, String idioma, String interesse, int anoLetivo, String curso) {
		super.setAll(codUsuario, nomeUsuario, email, fone, senha, endereco, cpf, rg, dataNascimento, idioma, interesse);
		setAnoLetivo(anoLetivo);
		setCurso(curso);
	}
	public int getAnoLetivo() {
		return anoLetivo;
	}
	public void setAnoLetivo(int anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
