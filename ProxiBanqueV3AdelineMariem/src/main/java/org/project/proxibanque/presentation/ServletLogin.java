package org.project.proxibanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.proxibanque.entities.Conseiller;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static final String LOGIN = "admin";
	private static final String PWD = "admin";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("loginConseiller");
		String pwd = request.getParameter("passwordConseiller");
		
		Conseiller cons = new Conseiller();
		
		request.setAttribute("conseiller", cons);
		
		RequestDispatcher requestDispatcher;
		
		if (LOGIN.equals(login) && PWD.equals(pwd)) {
			requestDispatcher = request.getRequestDispatcher("listeClients.jsp");
		} else {
			requestDispatcher = request.getRequestDispatcher("loginError.html");
		}
		
		requestDispatcher.forward(request, response);
		
	}

}
