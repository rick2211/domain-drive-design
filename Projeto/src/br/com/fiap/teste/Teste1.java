package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import br.com.fiap.excecao.Excecao;

public class Teste1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {

			con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM80991","221184");
			stmt = con.createStatement();
			int intNumero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
			String strNome = JOptionPane.showInputDialog("Digite o nome: ");
			rs = stmt.executeQuery("select * from T_DDD_CLIENTE where NR_CLIENTE="+intNumero+" and NM_CLIENTE='"+strNome+"'");
			if (rs.next()) {
			System.out.println("Logado com Sucesso .....");
			System.out.println("*/");
			System.out.println("Nome....:" + rs.getString("NM_CLIENTE"));
			System.out.println("Número..:" + rs.getString("NR_CLIENTE"));
			System.out.println("Estrelas:" + rs.getString("QT_ESTRELAS"));
			System.out.println("*/");
			}else {
				System.out.println("Login não foi efetuado!!!!");
			}
			System.out.println("Abriu..");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));

		}finally {
			try {
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println(Excecao.tratarExcecao(e));
			}
		}
	}

}
