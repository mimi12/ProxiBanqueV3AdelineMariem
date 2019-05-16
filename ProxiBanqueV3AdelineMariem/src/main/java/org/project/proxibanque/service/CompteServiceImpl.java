package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.persistence.CompteDaoImpl;
import org.project.proxibanque.persistence.ICompteDao;

/**
 * Classe qui impl�mente les m�thodes relatives � la gestion des comptes elle
 * implemente les m�thodes de l'interface {@link ICompteService}
 * 
 * @author Mariem et Adeline
 *
 */
public class CompteServiceImpl implements ICompteService {

	private ICompteDao dao = new CompteDaoImpl();

	/**
	 * M�thode qui permet d'ajouter un compte, dans le cas ou il est pas null
	 */
	@Override
	public void ajouterCompte(Compte compte) {
		if (compte != null) {
			dao.save(compte);
		}

	}

	/**
	 * M�thode qui permet de r�cup�rer un compte par son Id
	 */
	@Override
	public Compte trouverCompteParID(Long idCompte) {

		return dao.findCptById(idCompte);
	}

	/**
	 * M�thode qui permet de r�cup�rer la liste des comptes li�s � un client, ces
	 * comptes sont r�cup�r�s par idClient
	 */
	@Override
	public List<Compte> listerLesComptes(Long codClient) {

		return dao.findAllCpt(codClient);
	}

}
