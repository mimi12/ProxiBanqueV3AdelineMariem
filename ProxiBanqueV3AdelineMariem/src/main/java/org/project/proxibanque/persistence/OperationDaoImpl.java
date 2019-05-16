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
 * Classe qui impl�mente la m�thode addOperation() et la m�thode
 * consulterOperation()
 * 
 * @author Mariem etAdeline
 *
 */
public class OperationDaoImpl implements IOperationDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	/**
	 * M�thode permettant de persister une op�ration (versement et/ou retrait).
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
	 *M�thode qui permet de lister les op�rations effectu�es par compte
	 */
	@Override
	public List<Operation> consulterOperation(Long numCompte) {
		EntityManager em = emf.createEntityManager();
		Query req1 = em.createQuery("select op from Operaion op where op.compte.numCompte = :co");
		req1.setParameter("co", numCompte);
		return req1.getResultList();
	}

}
