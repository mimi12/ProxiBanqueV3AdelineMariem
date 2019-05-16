package org.project.proxibanque.service;

import java.util.Collection;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.persistence.ClientDaoImpl;
import org.project.proxibanque.persistence.IClientDao;

import org.slf4j.Logger;


/**
 * Classe impl�mentant les m�thodes relatives � la gestion de client telles
 * l'ajout et la consultation de client(s). Elle impl�mente l'interface
 * {@link IClientService}. On fait �galement le lien entre les couches service
 * et persistence.
 * 
 * @author Mariem et Adeline
 *
 */
public class ClientServiceImpl implements IClientService {

	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ClientServiceImpl.class);
	private IClientDao dao = new ClientDaoImpl();

	/**
	 * M�thode permettant de r�cup�rer un client via son id.
	 */
	@Override
	public Client getClient(Long id) {

		return dao.findClientById(id);
	}

	/**
	 * M�thode permettant d'ajouter un client.
	 */
	@Override
	public void addClient(Client client) {
		if (client != null) {
			dao.save(client);
			LOGGER.info("Client bien ajout� ");
		}
		else LOGGER.error("Pas de client ajout� !");
	}

	/**
	 * M�thode permettant de r�cup�rer la liste des clients.
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
