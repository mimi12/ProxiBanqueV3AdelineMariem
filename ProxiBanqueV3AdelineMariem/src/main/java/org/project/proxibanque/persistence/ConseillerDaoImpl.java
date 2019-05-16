package org.project.proxibanque.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.project.proxibanque.entities.Conseiller;

/**
 * Classe qui implémente les méthodes de l'interface {@link IConseillerDao} qui
 * permettent la gestion du conseiller *
 * 
 * @author Mariem et Adeline
 */
public class ConseillerDaoImpl implements IConseillerDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	// Conseiller

	@Override
	public void save(Conseiller cons) {

		EntityManager em10 = emf.createEntityManager();
		EntityTransaction txn10 = em10.getTransaction();

		try {

			txn10.begin();

			em10.persist(cons); // Créé une entité Conseiller en BDD

			txn10.commit();

		} catch (Exception e) {
			if (txn10 != null) {
				txn10.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em10 != null) {
				em10.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

	}

	Conseiller conseiller = null;

	@Override
	public Conseiller findConsById(Long idConseiller) {

		EntityManager em11 = emf.createEntityManager();
		EntityTransaction txn11 = em11.getTransaction();

		try {

			txn11.begin();

			conseiller = em11.find(Conseiller.class, idConseiller); // Cherche l'entité Conseiller correspondant à l'id

			txn11.commit();

		} catch (Exception e) {
			if (txn11 != null) {
				txn11.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em11 != null) {
				em11.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

		return conseiller;
	}

	// A IMPLEMENTER
	@Override
	public List<Conseiller> findAllCons() {
		return null;
	}

}
