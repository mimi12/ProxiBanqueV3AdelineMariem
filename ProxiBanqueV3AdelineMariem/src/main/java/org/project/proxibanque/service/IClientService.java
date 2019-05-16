package org.project.proxibanque.service;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

/**
 * Interface qui possède les signatures des méthodes getClient(),
 * getAllClients() et addClient(). Elle est implémentée par la classe
 * {@link ClientServiceImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface IClientService {

	/**
	 * Méthode permettant de récupérer un client via son id.
	 * 
	 * @param id
	 * @return
	 */
	public Client getClient(Long id);
	
	/**
	 * Méthode permettant de récupérer la liste des clients.
	 * 
	 * @return
	 */
	public Collection<Client> getAllClients(Long codeCons);

	/**
	 * Méthode permettant d'ajouter un client.
	 * 
	 * @param client
	 */
	public void addClient(Client client);

	public void deleteClient(Client client);

}
