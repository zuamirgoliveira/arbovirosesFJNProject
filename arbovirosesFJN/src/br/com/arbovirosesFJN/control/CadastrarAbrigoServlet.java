package br.com.arbovirosesFJN.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.arbovirosesFJN.exception.ValidacaoException;
import br.com.arbovirosesFJN.model.dao.AbrigoDAO;
import br.com.arbovirosesFJN.model.domain.Abrigo;

/**
 * Servlet implementation class AbrigoServlet
 */
@WebServlet("/cadastrarAbrigoServlet")
public class CadastrarAbrigoServlet extends HttpServlet {

	@Inject private AbrigoDAO abrigoDao;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastrarAbrigoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/pages/abrigo/page-cadastrar-abrigo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Abrigo abrigo = new Abrigo();
		try {
			abrigo.setNmAbrigo(request.getParameter("nmAbrigo"));
			abrigo.setNmContato(request.getParameter("nmContato"));
			abrigo.setEmail(request.getParameter("email"));
			abrigo.setNumTelefone1(request.getParameter("numTelefone1"));
			abrigo.setNumTelefone2(request.getParameter("numTelefone2"));
			abrigo.setLogradouro(request.getParameter("logradouro"));
			abrigo.setNumero(request.getParameter("numero"));
			abrigo.setBairro(request.getParameter("bairro"));
			abrigo.setCidade(request.getParameter("cidade"));
			abrigo.setEstado(request.getParameter("estado"));
			abrigo.setCep(request.getParameter("cep"));
			
			abrigo.validarAbrigo();
			abrigoDao.inserirAbrigo(abrigo);
			
			request.setAttribute("mensagem", "Abrigo salvo com sucesso!");
		} catch (ValidacaoException e) {
			request.setAttribute("mensagem", "Erro na validação de campos: " + e);
		} catch (SQLException er) {
			request.setAttribute("mensagem", "Erro de Banco de Dados: "+ er);
		} catch (ClassNotFoundException err) {
			request.setAttribute("mensagem", "Erro de Driver: "+ err);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/pages/abrigo/page-cadastrar-abrigo.jsp");
		dispatcher.forward(request, response);
	}
}
