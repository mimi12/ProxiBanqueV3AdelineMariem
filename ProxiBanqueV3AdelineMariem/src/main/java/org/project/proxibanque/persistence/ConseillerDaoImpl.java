package org.project.proxibanque.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.project.proxibanque.entities.Conseiller;

/**
 * Classe qui implémente les méthodes de l'interface {@link IConseillerDao} qui
 * permettent la gestion du conseiller, ces méthodes sont save(), findConsById()
 * 
 * @author Mariem et Adeline
 */
public class ConseillerDaoImpl implements IConseillerDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	

	/**
	 * Méthode qui permet de persister un objet de type {@link Conseiller} en base de données.
	 */
	@Override
	public void save(Conseiller cons) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {

			txn.begin();

			em.persist(cons);

			txn.commit();

		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}

	}

	Conseiller conseiller = null;

	/**
	 * Méthode qui permet de récupérer un conseiller par son id.
	 */
	@Override
	public Conseiller findConsById(Long idConseiller) {

		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();

		try {

			txn1.begin();

			conseiller = em1.find(Conseiller.class, idConseiller);
			conseiller.getListClients().size();
			txn1.commit();

		} catch (Exception e) {
			if (txn1 != null) {
				txn1.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em1 != null) {
				em1.close();
			}
			if (emf != null) {
				// emf.close();
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
