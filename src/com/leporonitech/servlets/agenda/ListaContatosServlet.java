package com.leporonitech.servlets.agenda;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leporonitech.agenda.entidades.Contato;
import com.leporonitech.agenda.repositorios.impl.ContatoRepositorioJdbc;
import com.leporonitech.repositorios.interfaces.AgendaRepositorio;

@WebServlet(urlPatterns = {"/agenda/listar"})
public class ListaContatosServlet extends HttpServlet {

	private static final long serialVersionUID = -796149632179061033L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AgendaRepositorio<Contato> agendaRepositorio = new ContatoRepositorioJdbc();

		try {
			List<Contato> contatos = agendaRepositorio.selecionar();
			req.setAttribute("listaContatos", contatos);

		} catch (SQLException e) {
			req.setAttribute("mensagemErro", e.getMessage());
		}
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/WEB-INF/paginas/agenda/listaContatos.jsp");
		dispatcher.forward(req, resp);
	}
}
