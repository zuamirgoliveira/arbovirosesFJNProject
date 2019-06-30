package br.com.arbovirosesFJN.constantes;

public class ConstantesDAO {
	
	public static final String SELECT_ABRIGO_ALL = "SELECT * FROM tb_abrigo";
	
	public static final String SELECT_ABRIGO_BY_ID = "SELECT * FROM tb_abrigo WHERE id_abrigo = ?";
	
	public static final String INSERT_ABRIGO = "INSERT tb_abrigo (nm_abrigo, nm_contato, email,  num_telefone1, num_telefone2, logradouro, numero, bairro, cidade, estado, cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	public static final String UPDATE_ABRIGO = "UPDATE tb_abrigo nm_abrigo = ?, nm_contato = ?, num_telefone1 = ?, num_telefone2 = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? WHERE id_abrigo = ?";

}
