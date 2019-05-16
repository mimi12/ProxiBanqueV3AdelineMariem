package org.project.proxibanque.persistence;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.entities.Compte;

public class ClientDaoImpl implements IClientDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	
	Client client = null;
	
	@Override
	public Client findClientById(Long id) {
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn2 = em2.getTransaction();

		try {

			txn2.begin();

			client = em2.find(Client.class, id); 
			//récupérer la liste des comptes
			client.getListComptes().size();
			txn2.commit();

		} catch (Exception e) {
			if (txn2 != null) {
				txn2.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em2 != null) {
				em2.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return client;
	}

	// Client

	@Override
	public void save(Client c) {

		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();

		try {

			txn1.begin();

			em1.persist(c); // Créé une entité Client en BDD

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
//				//emf.close();
			}
		}
	}


	@Override
	public Collection<Client> getClients(Long codeCons) {
		EntityManager em2 = emf.createEntityManager();
		Query req2 = em2.createQuery("select cl from Client cl where cl.conseiller.codeCons = :co");
		req2.setParameter("co", codeCons);
		return req2.getResultList();
	}

	@Override
	public void remove(Client client) {
		// TODO Auto-generated method stub
		
	}


}
