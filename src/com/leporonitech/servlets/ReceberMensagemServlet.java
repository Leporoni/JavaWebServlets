package com.leporonitech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReceberMensagemServlet extends HttpServlet{

	private static final long serialVersionUID = 2509441229478198091L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeUsuario = request.getParameter("nomeUsuario");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usu�rio!!!</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<p>Ol�, " + nomeUsuario + "</p>");
		out.println("	</body>");
		out.println("</html>");
		
	}
}
