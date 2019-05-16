package org.project.proxibanque.service;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

public interface IClientService {

	public Client getClient(Long id);

	public Collection<Client> getAllClients(Long codeCons);

	public void addClient(Client client);

	public void deleteClient(Client client);

}
