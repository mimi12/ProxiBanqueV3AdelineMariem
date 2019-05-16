package org.project.proxibanque.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.service.CompteServiceImpl;
import org.project.proxibanque.service.ICompteService;

/**
 * Servlet implementation class ServletListeComptes
 */
@WebServlet("/ServletListeComptes")
public class ServletListeComptes extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ICompteService serv = new CompteServiceImpl();
	private Client client = new Client();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListeComptes() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("comptes", serv.listerLesComptes(client.getIdClient()));
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
