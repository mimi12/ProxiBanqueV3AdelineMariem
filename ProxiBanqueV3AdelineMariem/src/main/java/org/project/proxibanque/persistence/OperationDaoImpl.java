package org.project.proxibanque.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.entities.Operation;

/**
 * Classe qui implémente la méthode addOperation.
 * 
 * @author Mariem etAdeline
 *
 */
public class OperationDaoImpl implements IOperationDao {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	/**
	 * Méthode permettant de persister une opération (versement et/ou retrait).
	 */
	@Override
	public Operation addOperation(Operation op, Long numCompte) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			
			txn.begin();
			
			Compte compte = em.find(Compte.class, numCompte);
			op.setCompte(compte);
			em.persist(op);
			
		} catch (Exception e) {

			if (txn != null) {
				txn.rollback();
			}
			
		} finally {
			
			if (em != null) {
				em.close();
			}
		}
		
		return op;
	}

}
