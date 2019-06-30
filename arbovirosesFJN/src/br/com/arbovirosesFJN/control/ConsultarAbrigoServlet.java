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

import br.com.arbovirosesFJN.model.dao.AbrigoDAO;

/**
 * Servlet implementation class AbrigoServlet
 */
@WebServlet("/consultarAbrigoServlet")
public class ConsultarAbrigoServlet extends HttpServlet {

	@Inject private AbrigoDAO abrigoDao;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsultarAbrigoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			request.setAttribute("abrigos", abrigoDao.getAbrigos());
		} catch (SQLException e) {
			request.setAttribute("mensagem", "Erro de Banco de Dados: "+ e);
		} catch (ClassNotFoundException er) {
			request.setAttribute("mensagem", "Erro de Driver: "+ er);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/pages/abrigo/page-consultar-abrigo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}
}
