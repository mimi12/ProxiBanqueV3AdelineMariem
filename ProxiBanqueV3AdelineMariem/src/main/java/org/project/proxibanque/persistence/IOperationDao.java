package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Operation;

/**
 * Interface qui possède la signature de la méthode addOperation(), elle est
 * implémentée par la classe {@link OperationDaoImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationDao {
	
	/**
	 * Méthode permettant de persister un objet opération (versement et/ou retrait).
	 * @param op
	 * @param numCompte
	 * @return
	 */
	public Operation addOperation(Operation op, Long numCompte);
	
	/**
	 * Méthode qui permet de récuperer la liste des opérations effectuées
	 * @param numCompte
	 * @return
	 */
	public List<Operation> consulterOperation(Long numCompte);

}
