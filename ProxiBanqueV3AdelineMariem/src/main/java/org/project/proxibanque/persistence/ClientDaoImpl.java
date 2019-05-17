package org.project.proxibanque.persistence;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.project.proxibanque.entities.Client;

/**
 * Classe qui impl�mente l'interface {@link IClientDao} elle permet
 * d'impl�menter les m�thodes de l'interface, ces m�thodes sont
 * findClientById(), save() et getClients().
 * 
 * @author Mariem et Adeline
 *
 */
public class ClientDaoImpl implements IClientDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	Client client = null;

	/**
	 * M�thode qui permet de r�cup�rer un client par son id.
	 */
	@Override
	public Client findClientById(Long id) {
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn2 = em2.getTransaction();

		try {

			txn2.begin();

			client = em2.find(Client.class, id);
			// r�cup�rer la liste des comptes
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

	/**
	 * M�thode qui permet de persister un objet de type {@link Client} en base de
	 * donn�es.
	 */
	@Override
	public void save(Client c) {

		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();

		try {

			txn1.begin();

			em1.persist(c); // Cr�� une entit� Client en BDD

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

	/**
	 * M�thode qui permet de r�cuperer une liste de clients de la base de donn�es.
	 */
	@Override
	public Collection<Client> getClients(Long codeCons) {
		EntityManager em2 = emf.createEntityManager();
		TypedQuery<Client> req2 = em2.createQuery("select cl from Client cl where cl.conseiller.idConseiller = :co",
				Client.class);
		req2.setParameter("co", codeCons);
		return req2.getResultList();
	}

	@Override
	public void remove(Client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateClient(Long idClient, Client updateClient) {
		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();

		try {

			txn1.begin();
			client = em1.find(Client.class, idClient);
			client.setNomClient(updateClient.getNomClient());
			client.setAdresse(updateClient.getAdresse());
			client.setPrenomClient(updateClient.getPrenomClient());
			client.setEmailClient(updateClient.getEmailClient());
			client.setVille(updateClient.getVille());
			client.setCodePostal(updateClient.getCodePostal());
			client.setTelephone(updateClient.getTelephone());
			em1.persist(updateClient); // Cr�� une entit� Client en BDD

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

}
