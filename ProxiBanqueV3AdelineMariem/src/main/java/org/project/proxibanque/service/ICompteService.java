package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Compte;

/**
 * Interface qui possède les signatures des méthodes ajouterCompte(),
 * trouverCompteParID() et listerLesComptes(), elle est implémenté par la classe 
 * {@link CompteServiceImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface ICompteService {

	/**
	 * Méthode qui permet d'ajouter un compte 
	 * @param compte
	 */
	public void ajouterCompte(Compte compte);

	/**
	 * Méthode qui permet de récupérer un compte par son Id
	 * @param idCompte
	 * @return
	 */
	public Compte trouverCompteParID(Long idCompte);

	/**
	 * Méthode qui permet de récupérer la liste des comptes par code Client
	 * @param codClient
	 * @return
	 */
	public List<Compte> listerLesComptes(Long codClient);

}
