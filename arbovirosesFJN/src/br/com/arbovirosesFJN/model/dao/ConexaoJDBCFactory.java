package br.com.arbovirosesFJN.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBCFactory {
	
	public static Connection getConexao() throws SQLException, ClassNotFoundException{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/arboviroses", "root", "");
	}

}
