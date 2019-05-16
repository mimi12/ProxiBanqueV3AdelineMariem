package org.project.proxibanque.persistence;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

public interface IClientDao {

	public Client findClientById(Long id);

	public Collection<Client> getClients();

	public void save(Client client);

	public void remove(Client client);

}
