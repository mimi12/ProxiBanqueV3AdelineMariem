package org.project.proxibanque.service;

import org.project.proxibanque.entities.Operation;

/**
 * Interface qui possède les signatures des méthodes verser(), retirer() et effectuerVirement().
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationService {
	
	public void verser(Long numCompte, Double montant);
	
	public void retirer(Long numCompte, Double montant);
	
	public void effectuerVirement(Long numCompte1, Long numCompte2, Double montant);

}
