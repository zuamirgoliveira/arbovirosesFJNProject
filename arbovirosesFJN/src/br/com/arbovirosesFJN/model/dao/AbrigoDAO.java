package br.com.arbovirosesFJN.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.arbovirosesFJN.constantes.ConstantesDAO;
import br.com.arbovirosesFJN.model.domain.Abrigo;

public class AbrigoDAO {
	
	public List<Abrigo> getAbrigos() throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(ConstantesDAO.SELECT_ABRIGO_ALL);
		ResultSet result = ps.executeQuery();
		
		List<Abrigo> abrigos = new ArrayList<>();
		
		while(result.next()) {
			abrigos.add(new Abrigo(result.getString(1),
								   result.getString(2),
								   result.getString(3),
								   result.getString(4),
								   result.getString(5),
								   result.getString(6),
								   result.getString(7),
								   result.getString(8),
								   result.getString(9),
								   result.getString(10),
								   result.getString(11),
								   result.getString(12)));
		}
		return abrigos;
	}
	
	public List<Abrigo> getAbrigosById() throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(ConstantesDAO.SELECT_ABRIGO_BY_ID);
		ResultSet rs = ps.executeQuery();
		
		List<Abrigo> abrigos = new ArrayList<>();
		
		while(rs.next()) {
			abrigos.add(new Abrigo(rs.getString(1),
								   rs.getString(2),
								   rs.getString(3),
								   rs.getString(4),
								   rs.getString(5),
								   rs.getString(6),
								   rs.getString(7),
								   rs.getString(8),
								   rs.getString(9),
								   rs.getString(10),
								   rs.getString(11),
								   rs.getString(12)));
		}
		return abrigos;
	}
	
	public boolean inserirAbrigo(Abrigo abrigo) throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement statemant = conexao.prepareStatement(ConstantesDAO.INSERT_ABRIGO, Statement.RETURN_GENERATED_KEYS);
		
		statemant.setString(1, abrigo.getNmAbrigo());
		statemant.setString(2, abrigo.getNmContato());
		statemant.setString(3, abrigo.getEmail());
		statemant.setString(4, abrigo.getNumTelefone1());
		statemant.setString(5, abrigo.getNumTelefone2());
		statemant.setString(6, abrigo.getLogradouro());
		statemant.setString(7, abrigo.getNumero());
		statemant.setString(8, abrigo.getBairro());
		statemant.setString(9, abrigo.getCidade());
		statemant.setString(10, abrigo.getEstado());
		statemant.setString(11, abrigo.getCep());
		
		return statemant.execute();
		
	}
	
	public List<Abrigo> updateAbrigo() throws SQLException, ClassNotFoundException {
		Connection conexao = ConexaoJDBCFactory.getConexao();
		PreparedStatement ps = conexao.prepareStatement(ConstantesDAO.UPDATE_ABRIGO);
		ResultSet rs = ps.executeQuery();
		
		List<Abrigo> abrigos = new ArrayList<>();
		
		while(rs.next()) {

			abrigos.add(new Abrigo(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
					rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)));
		}
		System.out.println(abrigos.get(0).toString());
	
		return abrigos;
	}

}
