package org.project.proxibanque.service;

/**
 * Interface qui possède les signatures des méthodes verser(), retirer() et
 * effectuerVirement(). Elle est implémentée par la classe
 * {@link OperationServiceImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationService {

	/**
	 * Méthode permettant de verser un montant sur le compte client via son numéro
	 * de compte.
	 * 
	 * @param numCompte
	 * @param montant
	 */
	public void verser(Long numCompte, double montant);

	/**
	 * Méthode permettant de retirer un montant sur le compte client via son numéro
	 * de compte.
	 * 
	 * @param numCompte
	 * @param montant
	 */
	public void retirer(Long numCompte, double montant);

	/**
	 * Méthode permettant d'effectuer le virement d'un montant de compte à compte
	 * via les numéros de compte. Dans cette méthode, on utilise les méthodes
	 * précédentes verser() et retirer().
	 * 
	 * @param numCompte1
	 * @param numCompte2
	 * @param montant
	 */
	public void effectuerVirement(Long numCompte1, Long numCompte2, double montant);
	
	/**
	 * Méthode qui permet de récuperer la liste des opérations effectuées par compte
	 * @param numCompte
	 */
	public void recupererOperations(Long numCompte);
	
	

}
