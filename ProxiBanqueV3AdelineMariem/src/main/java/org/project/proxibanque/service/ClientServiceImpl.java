package org.project.proxibanque.service;

import java.util.Collection;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.persistence.ClientDaoImpl;
import org.project.proxibanque.persistence.IClientDao;

import org.slf4j.Logger;


/**
 * Classe implémentant les méthodes relatives à la gestion de client telles
 * l'ajout et la consultation de client(s). Elle implémente l'interface
 * {@link IClientService}. On fait également le lien entre les couches service
 * et persistence.
 * 
 * @author Mariem et Adeline
 *
 */
public class ClientServiceImpl implements IClientService {

	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ClientServiceImpl.class);
	private IClientDao dao = new ClientDaoImpl();

	/**
	 * Méthode permettant de récupérer un client via son id.
	 */
	@Override
	public Client getClient(Long id) {

		return dao.findClientById(id);
	}

	/**
	 * Méthode permettant d'ajouter un client.
	 */
	@Override
	public void addClient(Client client) {
		if (client != null) {
			dao.save(client);
			LOGGER.info("Client bien ajouté ");
		}
		else LOGGER.error("Pas de client ajouté !");
	}

	/**
	 * Méthode permettant de récupérer la liste des clients.
	 */
	@Override
	public Collection<Client> getAllClients(Long codeCons) {
		return dao.getClients(codeCons);
	}

	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub

	}

}
