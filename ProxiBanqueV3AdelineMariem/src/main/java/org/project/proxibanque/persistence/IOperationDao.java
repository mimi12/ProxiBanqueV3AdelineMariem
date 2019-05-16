package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Operation;

/**
 * Interface qui poss�de la signature de la m�thode addOperation(), elle est
 * impl�ment�e par la classe {@link OperationDaoImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface IOperationDao {
	
	/**
	 * M�thode permettant de persister un objet op�ration (versement et/ou retrait).
	 * @param op
	 * @param numCompte
	 * @return
	 */
	public Operation addOperation(Operation op, Long numCompte);
	
	/**
	 * M�thode qui permet de r�cuperer la liste des op�rations effectu�es
	 * @param numCompte
	 * @return
	 */
	public List<Operation> consulterOperation(Long numCompte);

}
