package br.com.fiap.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.excecao.Excecao;

public class Teste2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {

			con = Conexao.conectar();
			stmt = con.prepareStatement("select * from T_DDD_CLIENTE where NR_CLIENTE=? and NM_CLIENTE=?");
			int intNumero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
			String strNome = JOptionPane.showInputDialog("Digite o nome: ");
			stmt.setInt(1, intNumero);
			stmt.setString(2, strNome);
			rs = stmt.executeQuery();
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
