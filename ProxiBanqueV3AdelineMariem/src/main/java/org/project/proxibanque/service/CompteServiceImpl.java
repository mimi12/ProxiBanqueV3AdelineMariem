package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.persistence.CompteDaoImpl;
import org.project.proxibanque.persistence.ICompteDao;

/**
 * Classe qui implémente les méthodes relatives à la gestion des comptes elle
 * implemente les méthodes de l'interface {@link ICompteService}
 * 
 * @author Mariem et Adeline
 *
 */
public class CompteServiceImpl implements ICompteService {

	private ICompteDao dao = new CompteDaoImpl();

	/**
	 * Méthode qui permet d'ajouter un compte, dans le cas ou il est pas null
	 */
	@Override
	public void ajouterCompte(Compte compte) {
		if (compte != null) {
			dao.save(compte);
		}

	}

	/**
	 * Méthode qui permet de récupérer un compte par son Id
	 */
	@Override
	public Compte trouverCompteParID(Long idCompte) {

		return dao.findCptById(idCompte);
	}

	/**
	 * Méthode qui permet de récupérer la liste des comptes liés à un client, ces
	 * comptes sont récupérés par idClient
	 */
	@Override
	public List<Compte> listerLesComptes(Long codClient) {

		return dao.findAllCpt(codClient);
	}

}
