package com.leporonitech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EscrevaSeuNomeServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5906741435867508058L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =  response.getWriter();
		out.println("<html>");
		out.println(	"<head>");
		out.println(		"<title>Nome do usuário..</title>");
		out.println(	"</head>");
		out.println(	"<body>");
		out.println(		"<form action=\"/java-web-servlets/receberMensagem\">");
		out.println(			"<p>Digite seu nome:</p>");
		out.println(			"<p><input type=\"text\" name=\"nomeUsuario\"></p>");
		out.println(			"<p><button type=\"submit\">Enviar!</button></p>");
		out.println(		"</form>");
		out.println(	"</body>");
		out.println("</html>");
	}
	
	

}
