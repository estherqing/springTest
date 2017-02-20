package com.hsmdata.springTest.modules.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExactServlet
 */
@WebServlet("/ExactServlet")
public class ExactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ExactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("This is : ").append(this.getClass() + "\n");
		response.getWriter().append("ContextPath: ").append(request.getContextPath() + "\n");
		response.getWriter().append("ServletPath: ").append(request.getServletPath() + "\n");
		response.getWriter().append("ServerName: ").append(request.getServerName() + "\n");
		System.out.println("getRequestURL: " + request.getRequestURL());
		System.out.println("getRequestURI: " + request.getRequestURI());
		System.out.println("getQueryString: " + request.getQueryString());
		System.out.println("getRemoteAddr: " + request.getRemoteAddr());
		System.out.println("getRemoteHost: " + request.getRemoteHost());
		System.out.println("getRemotePort: " + request.getRemotePort());
		System.out.println("getRemoteUser: " + request.getRemoteUser());
		System.out.println("getLocalAddr: " + request.getLocalAddr());
		System.out.println("getLocalName: " + request.getLocalName());
		System.out.println("getLocalPort: " + request.getLocalPort());
		System.out.println("getMethod: " + request.getMethod());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
