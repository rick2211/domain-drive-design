package br.com.fiap.teste;

import br.com.fiap.beans.Aluno;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Instituicao;
import br.com.fiap.beans.Medico;
import br.com.fiap.beans.Modalidade;
import br.com.fiap.beans.Professor;
import br.com.fiap.beans.Sala;
import br.com.fiap.view.Entrada;

public class TesteAcademia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Sala sala1= new Sala(Entrada.inteiro("Numero da sala:"), Entrada.texto("Andar:"), Entrada.inteiro("Numero Sequenial:"), Entrada.inteiro("Capacidade:"), Entrada.texto("Observaçao:"));

		Modalidade mod1 = new Modalidade(Entrada.longo("Codigo:"), Entrada.texto("Descrição:"), Entrada.texto("Inicio:"), Entrada.texto("Termino:"));
		char resposta;

		System.out.println(resposta=Entrada.caractere("Digite (A) para cadastrar Aluno, digite (P) para cadatrar um Professor ou digite (M) para Medico."));

		if (resposta=='A') {

			Aluno a1 = new Aluno(Entrada.texto("Nome do Aluno:"), new Endereco(Entrada.texto("Logradouro"), Entrada.texto("Descrição:"), Entrada.inteiro("Numero:"), Entrada.texto("Complemento:"), Entrada.texto("Bairro"),
					Entrada.texto("CEP:"), Entrada.texto("Cidade"), Entrada.texto("Estado")), 
					Entrada.inteiro("Telefone:"), Entrada.texto("Email:"), Entrada.texto("RG:"), Entrada.texto("CPF:"),
					Entrada.texto("Data nascimento:"), Entrada.texto("Sexo:").charAt(0), Entrada.longo("Matricula:"),
					new Instituicao(Entrada.texto("Nome da Instituicao:"), new Endereco(Entrada.texto("Logradouro"), Entrada.texto("Descrição:"), Entrada.inteiro("Numero:"), Entrada.texto("Complemento:"), Entrada.texto("Bairro"),
							Entrada.texto("CEP:"), Entrada.texto("Cidade"), Entrada.texto("Estado")),
							Entrada.inteiro("Telefone da Instituiçao:"), Entrada.texto("Email da Institucao:"), Entrada.texto("Razao Social:"), Entrada.texto("CNPJ:"),
							Entrada.inteiro("Quantidade de Funcinarios:"), Entrada.longo("Codigo da Instituicao"), Entrada.texto("URL:"), Entrada.texto("Contato:"), 
							Entrada.decimal("Desconto")), Entrada.texto("Data de Matricula:"));
		} else if (resposta=='P') {
			Professor p1=new Professor(Entrada.texto("Nome do Professor:"), new Endereco(Entrada.texto("Logradouro"), Entrada.texto("Descrição:"), Entrada.inteiro("Numero:"), Entrada.texto("Complemento:"), Entrada.texto("Bairro"),
					Entrada.texto("CEP:"), Entrada.texto("Cidade"), Entrada.texto("Estado")),Entrada.inteiro("Telefone:"), Entrada.texto("Email:"), Entrada.texto("RG:"), Entrada.texto("CPF:"),
					Entrada.texto("Data nascimento:"), Entrada.texto("Sexo:").charAt(0), Entrada.texto("Cargo:"), Entrada.decimal("Salario"), 
					Entrada.inteiro("Carga Horaria Semanal:"), Entrada.longo("Matricula:"),
					Entrada.texto("Apelido:"));
		}else {
			Medico m1=new Medico(Entrada.texto("Nome do Médico:"), new Endereco(Entrada.texto("Logradouro"), Entrada.texto("Descrição:"), Entrada.inteiro("Numero:"), Entrada.texto("Complemento:"), Entrada.texto("Bairro"),
					Entrada.texto("CEP:"), Entrada.texto("Cidade"), Entrada.texto("Estado")),Entrada.inteiro("Telefone:"), Entrada.texto("Email:"), Entrada.texto("RG:"), Entrada.texto("CPF:"),
					Entrada.texto("Data nascimento:"), Entrada.texto("Sexo:").charAt(0), Entrada.texto("Cargo:"), Entrada.decimal("Salario"), 
					Entrada.inteiro("Carga Horaria Semanal:"), Entrada.longo("Codigo:"),
					Entrada.inteiro("CRM:"));
		}
		
		
		
		

	} //Fecha Main..





}
