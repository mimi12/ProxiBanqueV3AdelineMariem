package org.project.proxibanque.presentation;

import java.util.ArrayList;
import java.util.List;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.entities.CompteCourant;
import org.project.proxibanque.entities.CompteEpargne;
import org.project.proxibanque.service.ClientServiceImpl;
import org.project.proxibanque.service.IClientService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Compte> listComptes = new ArrayList<Compte>();
		IClientService ser = new ClientServiceImpl();
		Client c1 = new Client();
		c1.setNomClient("Mariem");
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
