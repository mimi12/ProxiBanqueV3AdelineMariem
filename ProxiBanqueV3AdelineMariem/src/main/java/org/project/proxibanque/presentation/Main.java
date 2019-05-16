package org.project.proxibanque.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.entities.CompteCourant;
import org.project.proxibanque.entities.CompteEpargne;
import org.project.proxibanque.entities.Conseiller;
import org.project.proxibanque.entities.Operation;
import org.project.proxibanque.entities.OperationRetrait;
import org.project.proxibanque.entities.OperationVersement;
import org.project.proxibanque.persistence.IOperationDao;
import org.project.proxibanque.service.ClientServiceImpl;
import org.project.proxibanque.service.ConseillerServiceImpl;
import org.project.proxibanque.service.IClientService;
import org.project.proxibanque.service.IConseillerService;
import org.project.proxibanque.service.IOperationService;
import org.project.proxibanque.service.OperationServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Compte> listComptes = new ArrayList<Compte>();
		IClientService ser = new ClientServiceImpl();

		Client c1 = new Client();
		Client c2 = new Client();
		c1.setNomClient("Lilo");
		c2.setNomClient("Jason");

		Conseiller cons1 = new Conseiller();
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

	}

}
