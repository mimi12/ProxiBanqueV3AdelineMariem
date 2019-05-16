package org.project.proxibanque.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.project.proxibanque.entities.Compte;

public class CompteDaoImpl implements ICompteDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	Compte compte = null;

	/**
	 * Méthode permettant de persister un objet compte en base de données.
	 */
	@Override
	public void save(Compte cpt) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {

			txn.begin();

			em.persist(cpt);

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
		}

	}

	/**
	 * Méthode permettant de récupérer un compte via son idCompte.
	 */
	@Override
	public Compte findCptById(Long idCompte) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {

			txn.begin();

			compte = em.find(Compte.class, idCompte);
			compte.getListOperations().size();

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
		}

		return compte;
	}

	/**
	 * Méthode permettant de récupérer la liste des comptes.
	 */
	@Override
	public List<Compte> findAllCpt(Long codClient) {
		EntityManager em3 = emf.createEntityManager();
		TypedQuery<Compte> req3 = em3.createQuery("select comp from Compte comp where comp.client.idClient = :co", Compte.class);
		req3.setParameter("co", codClient);
		return req3.getResultList();
	}

	@Override
	public void remove(Compte compte) {
		// TODO Auto-generated method stub

	}

}
