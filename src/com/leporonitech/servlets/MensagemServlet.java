package com.leporonitech.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MensagemServlet extends HttpServlet {

	private static final long serialVersionUID = -8009912235933692008L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getServletContext()
				.getRequestDispatcher("/WEB-INF/paginas/FormMensagem.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getServletContext()
				.getRequestDispatcher("/WEB-INF/paginas/ResultMensagem.jsp");
		dispatcher.forward(req, resp);

	}

}
