package org.project.proxibanque.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.entities.CompteCourant;
import org.project.proxibanque.entities.CompteEpargne;
import org.project.proxibanque.entities.Conseiller;
import org.project.proxibanque.service.ClientServiceImpl;
import org.project.proxibanque.service.IClientService;

/**
 * Servlet implementation class ServletListeClients
 */
@WebServlet("/ServletListeClients")
public class ServletListeClients extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private IClientService serv = new ClientServiceImpl();
	Conseiller cons1 = new Conseiller();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListeClients() {
        super();
    	
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Compte> listComptes = new ArrayList<Compte>();
		IClientService ser = new ClientServiceImpl();
		Client c1 = new Client();
		Client c2 = new Client();
		c1.setNomClient("Lilo");
		c2.setNomClient("Jason");

		cons1.setNomConseiller("Admin1");

		Set<Client> listClients = new HashSet<Client>();
		listClients.add(c1);
		listClients.add(c2);

		cons1.setListClients(listClients);
		c1.setConseiller(cons1);
		c2.setConseiller(cons1);

		Compte comp1 = new CompteCourant();
		Compte comp2 = new CompteEpargne();

		listComptes.add(comp2);
		listComptes.add(comp1);
		comp1.setClient(c1);
		comp2.setClient(c1);
		c1.setListComptes(listComptes);
		ser.addClient(c1);
		
		request.setAttribute("clients", serv.getAllClients(cons1.getIdConseiller()));
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("listeClients.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

}
