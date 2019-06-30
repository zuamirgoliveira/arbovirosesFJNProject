package br.com.arbovirosesFJN.model.domain;

import br.com.arbovirosesFJN.exception.ValidacaoException;

public class Abrigo {
	
	private String idAbrigo;
	private String nmAbrigo;
	private String nmContato;
	private String email;
	private String numTelefone1;
	private String numTelefone2;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Abrigo(String idAbrigo, String nmAbrigo, String nmContato, String email, String numTelefone1, String numTelefone2,
			String logradouro, String numero, String bairro, String cidade, String estado, String cep) {
		super();
		this.idAbrigo = idAbrigo;
		this.nmAbrigo = nmAbrigo;
		this.nmContato = nmContato;
		this.email = email;
		this.numTelefone1 = numTelefone1;
		this.numTelefone2 = numTelefone2;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Abrigo() {
		//Construtor padrao da classe.
	}

	public String getIdAbrigo() {
		return idAbrigo;
	}

	public void setIdAbrigo(String idAbrigo) {
		this.idAbrigo = idAbrigo;
	}

	public String getNmAbrigo() {
		return nmAbrigo;
	}

	public void setNmAbrigo(String nmAbrigo) {
		this.nmAbrigo = nmAbrigo;
	}

	public String getNmContato() {
		return nmContato;
	}

	public void setNmContato(String nmContato) {
		this.nmContato = nmContato;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTelefone1() {
		return numTelefone1;
	}

	public void setNumTelefone1(String numTelefone1) {
		this.numTelefone1 = numTelefone1;
	}

	public String getNumTelefone2() {
		return numTelefone2;
	}

	public void setNumTelefone2(String numTelefone2) {
		this.numTelefone2 = numTelefone2;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Abrigo [nmAbrigo=" + nmAbrigo + ", nomeContato=" + nmContato
				+ ", numTelefone1=" + numTelefone1 + ", numTelefone2=" + numTelefone2 + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep="
				+ cep + "]";
	}
	
	public void validarAbrigo() throws ValidacaoException {
		
		if (nmAbrigo == null || "".equals(nmAbrigo)) {
			throw new ValidacaoException("Campo nome abrigo é obrigatório.");
		}
		
		if (nmContato == null || "".equals(nmContato)) {
			throw new ValidacaoException("Campo nome contato é obrigatório.");
		}
		
		if (numTelefone1 == null || "".equals(numTelefone1)) {
			throw new ValidacaoException("Número telefone é obrigatório.");
		}
		
		if (logradouro == null || "".equals(logradouro)) {
			throw new ValidacaoException("Campo logradouro é obrigatório.");
		}
		
		if (numero == null || "".equals(numero)) {
			throw new ValidacaoException("Número é obrigatório.");
		}
		
		if (bairro == null || "".equals(bairro)) {
			throw new ValidacaoException("Bairro é obrigatório.");
		}
		
		if (estado == null || "".equals(estado)) {
			throw new ValidacaoException("Estado é obrigatório.");
		}
		
		if (cep == null || "".equals(cep)) {
			throw new ValidacaoException("Cep é obrigatório.");
		}
	}
}
