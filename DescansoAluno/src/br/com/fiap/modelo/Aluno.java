package br.com.fiap.modelo;

public class Aluno {
	private String nome;
	private String rm;
	private double ps;
	private double am;
	private double nac;
	private int falta;
	private Curso curso;
	
	public void setAll(String nome, String rm, double ps, double am, double nac, int falta, Curso curso) {
		setNome(nome);
		setRm(rm);
		setPs(ps);
		setAm(am);
		setNac(nac);
		setFalta(falta);
		setCurso(curso);
	}
	public String getAll() {
		return "Nome" + nome + "\n" + "Rm" + rm + "\n" + "Ps" + ps +"\n" + "Am" + am + "\n" + "Nac" + nac +"\n" + "Falta" + falta +"\n" + "Curso" + getCurso();
	}

	public void lancarFalta() {
		falta++;
	}
	public String getStatus() {
		if (getFalta() >40) {
			return "Reprovado";
		} else {
			if (getMedia()>=6) {
				return "Aprovado";
			}else if (getMedia()<4) {
				return "Reprovado";

			} else {
				return "Exame";
			}
		}

	}

	public double getMedia() {
		return ps*0.5 + am * 0.30 + nac*0.2;
	}
	public Aluno() {
		super();
	}
	public Aluno(String nome, String rm, double ps, double am, double nac, int falta, Curso curso) {
		setNome(nome);
		setRm(rm);
		setPs(ps);
		setAm(am);
		setNac(nac);
		setFalta(falta);
		setCurso(curso);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length()<2 || nome.length()>50) {
			nome = "NOME INVÁLIDO";
		}
		this.nome = nome.toUpperCase();
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm.toUpperCase();
	}
	public double getPs() {
		return ps;
	}
	public void setPs(double ps) {
		this.ps = ps;
	}
	public double getAm() {
		return am;
	}
	public void setAm(double am) {
		this.am = am;
	}
	public double getNac() {
		return nac;
	}
	public void setNac(double nac) {
		this.nac = nac;
	}
	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}


}
