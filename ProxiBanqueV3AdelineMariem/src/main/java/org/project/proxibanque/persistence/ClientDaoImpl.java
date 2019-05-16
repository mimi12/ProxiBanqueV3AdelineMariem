package org.project.proxibanque.persistence;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
						// Cherche l'entité Client correspondant à l'id

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
	public void updateClient(Long idClient, String newName, String newPrenom, String newMail, String newAdresse) {
		EntityManager emcl = emf.createEntityManager();
		EntityTransaction txncl = emcl.getTransaction();

		try {

			txncl.begin();

			client = emcl.find(Client.class, idClient); // Cherche l'entité Client correspondant à l'id
			client.setNomClient(newName);
			client.setPrenomClient(newPrenom);
			client.setAdresse(newAdresse);
			client.setEmailClient(newMail);
			txncl.commit();

		} catch (Exception e) {
			if (txncl != null) {
				txncl.rollback();
			}
			e.printStackTrace();
		} finally {
			if (emcl != null) {
				emcl.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return;
	}

	// A IMPLEMENTER


	@Override
	public Collection<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Client client) {
		// TODO Auto-generated method stub
		
	}

	// Compte

	



}
