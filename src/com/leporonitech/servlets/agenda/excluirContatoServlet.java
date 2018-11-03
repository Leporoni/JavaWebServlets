package com.leporonitech.servlets.agenda;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leporonitech.agenda.entidades.Contato;
import com.leporonitech.agenda.repositorios.impl.ContatoRepositorioJdbc;
import com.leporonitech.repositorios.interfaces.AgendaRepositorio;

@WebServlet(urlPatterns = {"/agenda/excluir"})
public class excluirContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 124520255503647409L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idContato = Integer.parseInt(req.getParameter("id"));
		Contato contatoExcluido = new Contato();
		contatoExcluido.setId(idContato);
		AgendaRepositorio<Contato> agendaRepositorio = new ContatoRepositorioJdbc();
		try {
			agendaRepositorio.excluir(contatoExcluido);
		} catch (SQLException e) {
			req.getSession().setAttribute("mensagemErro", e.getMessage());
		}
		resp.sendRedirect(req.getContextPath() + "/agenda/listar");
	}
}
