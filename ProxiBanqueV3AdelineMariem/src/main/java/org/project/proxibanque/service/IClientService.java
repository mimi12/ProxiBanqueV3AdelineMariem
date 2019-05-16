package org.project.proxibanque.service;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

/**
 * Interface qui poss�de les signatures des m�thodes getClient(),
 * getAllClients() et addClient(). Elle est impl�ment�e par la classe
 * {@link ClientServiceImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface IClientService {

	/**
	 * M�thode permettant de r�cup�rer un client via son id.
	 * 
	 * @param id
	 * @return
	 */
	public Client getClient(Long id);
	
	/**
	 * M�thode permettant de r�cup�rer la liste des clients.
	 * 
	 * @return
	 */
	public Collection<Client> getAllClients(Long codeCons);

	/**
	 * M�thode permettant d'ajouter un client.
	 * 
	 * @param client
	 */
	public void addClient(Client client);

	public void deleteClient(Client client);

}
