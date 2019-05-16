package org.project.proxibanque.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.entities.Operation;

/**
 * Classe qui implémente la méthode addOperation() et la méthode
 * consulterOperation()
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
		//	op.setCompte(compte);
			em.persist(op);

		} catch (Exception e) {

			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {

			if (em != null) {
				em.close();
			}
		}

		return op;
	}

	/**
	 *Méthode qui permet de lister les opérations effectuées par compte
	 */
	@Override
	public List<Operation> consulterOperation(Long numCompte) {
		EntityManager em = emf.createEntityManager();
		Query req1 = em.createQuery("select op from Operaion op where op.compte.numCompte = :co");
		req1.setParameter("co", numCompte);
		return req1.getResultList();
	}

}
