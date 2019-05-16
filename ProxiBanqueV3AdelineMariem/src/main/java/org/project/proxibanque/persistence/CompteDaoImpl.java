package org.project.proxibanque.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.project.proxibanque.entities.Compte;

public class CompteDaoImpl implements ICompteDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	@Override
	public void save(Compte cpt) {
		// TODO Auto-generated method stub

	}

	@Override
	public Compte findCptById(Long idCompte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCompte(Compte compte) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Compte compte) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Compte> findAllCpt(Long codClient) {
		EntityManager em3 = emf.createEntityManager();
		Query req3 = em3.createQuery("select comp from Compte comp where comp.client.codClient = :co");
		req3.setParameter("co", codClient);
		return req3.getResultList();
	}

}
