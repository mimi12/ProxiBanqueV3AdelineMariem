package org.project.proxibanque.service;

/**
 * Interface qui poss�de les signatures des m�thodes verser(), retirer() et
 * effectuerVirement(). Elle est impl�ment�e par la classe
 * {@link OperationServiceImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationService {

	/**
	 * M�thode permettant de verser un montant sur le compte client via son num�ro
	 * de compte.
	 * 
	 * @param numCompte
	 * @param montant
	 */
	public void verser(Long numCompte, double montant);

	/**
	 * M�thode permettant de retirer un montant sur le compte client via son num�ro
	 * de compte.
	 * 
	 * @param numCompte
	 * @param montant
	 */
	public void retirer(Long numCompte, double montant);

	/**
	 * M�thode permettant d'effectuer le virement d'un montant de compte � compte
	 * via les num�ros de compte. Dans cette m�thode, on utilise les m�thodes
	 * pr�c�dentes verser() et retirer().
	 * 
	 * @param numCompte1
	 * @param numCompte2
	 * @param montant
	 */
	public void effectuerVirement(Long numCompte1, Long numCompte2, double montant);
	
	/**
	 * M�thode qui permet de r�cuperer la liste des op�rations effectu�es par compte
	 * @param numCompte
	 */
	public void recupererOperations(Long numCompte);
	
	

}
