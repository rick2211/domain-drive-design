package br.com.fiap.principal;





import br.com.fiap.modelo.Aluno;
import br.com.fiap.modelo.Curso;
import br.com.fiap.view.Magica;

public class TesteAluno {
	
	
	public static void main(String[] args) {
		//Caixa alta
		String nome = new String();
		nome = "churros".toUpperCase();
		if(nome.length()<2 || nome.length()<8) {
			System.out.println("Erro do juninho");
		}
		if(nome.equals("CHURROS")) {
			System.out.println("Engorda");
			
		}
		
		//Caixa baixa
		String email = new String();
		email = "RM34232142@FIAP.COM.BR".toLowerCase();
		
		if (email.indexOf("@")<2) {
			System.out.println("Email Inválido");
		}
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")));
		
		System.out.println(nome + "\n" + email);
		
		Aluno aluno = new Aluno();
		aluno.setNome(Magica.texto("Digite o Nome: "));
		aluno.setPs(Magica.decimal("Digite a PS : "));
		aluno.setAm(Magica.decimal("Digite a AM : "));
		aluno.setNac(Magica.decimal("Digite a Nac : "));
		aluno.setFalta(Magica.inteiro("Digite a Falta : "));
		aluno.setRm(Magica.texto("Digite a Rm : "));
		Curso curso=new Curso();
		curso.setNome(Magica.texto("Nome do Curso"));
		curso.setSigla(Magica.texto("Sigla do Curso"));
		curso.setTitulacao(Magica.texto("Titulacao do Curso"));

		aluno.setCurso(curso);
		System.out.println(aluno.getAll());
		System.out.println(aluno.getMedia());
		System.out.println(aluno.getStatus());

	}

}
