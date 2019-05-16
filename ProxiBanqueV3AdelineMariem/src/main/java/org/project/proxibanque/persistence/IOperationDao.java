package org.project.proxibanque.persistence;

import org.project.proxibanque.entities.Operation;

/**
 * Interface qui possède la signature de la méthode addOperation().
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationDao {
	
	public Operation addOperation(Operation op, Long numCompte);

}
