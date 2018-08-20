package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexao.Conexao;

public class ClienteDAO {
	
	
	private Connection con;
	
	public ClienteDAO() throws Exception{
		con=Conexao.conectar();
	}
	
	public String gravar(Cliente obj) throws Exception {
		PreparedStatement stmt = con.prepareStatement("INSERT INTO T_DDD_CLIENTE (NM_CLIENTE, NR_CLIENTE, QT_ESTRELAS) VALUES (?,?,?)");
		stmt.setString(1, obj.getNome());
		stmt.setInt(2, obj.getNumero());
		stmt.setInt(3, obj.getQtdEstrelas());
		stmt.executeUpdate();
		return "Gravado com Sucesso!!";
	}
	
	public Cliente pesquisarPorNumero(int valor) throws Exception {
		PreparedStatement stmt = con.prepareStatement("select * from T_DDD_CLIENTE WHERE NR_CLIENTE=?");
		stmt.setInt(1, valor);
		ResultSet rs = stmt.executeQuery();
		Cliente cliente = new Cliente();
		if(rs.next()) {
			cliente.setNome(rs.getString("NM_CLIENTE"));
			cliente.setNumero(rs.getInt("NR_CLIENTE"));
			cliente.setQtdEstrelas(rs.getInt("QT_ESTRELAS"));
			
		}
		return cliente;
	}

}
