package org.project.proxibanque.persistence;

import org.project.proxibanque.entities.Operation;

/**
 * Interface qui poss�de la signature de la m�thode addOperation().
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationDao {
	
	public Operation addOperation(Operation op, Long numCompte);

}
