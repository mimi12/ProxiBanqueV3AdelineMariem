package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Compte;

/**
 * Interface qui poss�de les signatures des m�thodes ajouterCompte(),
 * trouverCompteParID() et listerLesComptes(), elle est impl�ment� par la classe 
 * {@link CompteServiceImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface ICompteService {

	/**
	 * M�thode qui permet d'ajouter un compte 
	 * @param compte
	 */
	public void ajouterCompte(Compte compte);

	/**
	 * M�thode qui permet de r�cup�rer un compte par son Id
	 * @param idCompte
	 * @return
	 */
	public Compte trouverCompteParID(Long idCompte);

	/**
	 * M�thode qui permet de r�cup�rer la liste des comptes par code Client
	 * @param codClient
	 * @return
	 */
	public List<Compte> listerLesComptes(Long codClient);

}
