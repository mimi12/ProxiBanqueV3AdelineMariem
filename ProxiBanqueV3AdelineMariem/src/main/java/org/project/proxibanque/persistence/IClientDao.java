package org.project.proxibanque.persistence;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

/**
 * Interface qui contient les signatures des méthodes save(), getClients(),
 * findClientById()
 * 
 * @author Mariem et Adeline
 *
 */
public interface IClientDao {

	public Client findClientById(Long id);

	public Collection<Client> getClients(Long codeCons);

	public void save(Client client);

	public void remove(Client client);

}
