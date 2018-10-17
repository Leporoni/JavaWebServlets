package com.leporonitech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MensagemServlet extends HttpServlet{

	private static final long serialVersionUID = -8009912235933692008L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out =  resp.getWriter();
		out.println("<html>");
		out.println(	"<head>");
		out.println(		"<title>Nome do usuário..</title>");
		out.println(	"</head>");
		out.println(	"<body>");
		out.println(		"<form action=\"/java-web-servlets/mensagem\" method=\"post\">");
		out.println(			"<p>Digite seu nome:</p>");
		out.println(			"<p><input type=\"text\" name=\"nomeUsuario\"></p>");
		out.println(			"<p><button type=\"submit\">Enviar!</button></p>");
		out.println(		"</form>");
		out.println(	"</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeUsuario = req.getParameter("nomeUsuario");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usuário!!!</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<p>Olá, " + nomeUsuario + "</p>");
		out.println("	</body>");
		out.println("</html>");
		
	}	

}
