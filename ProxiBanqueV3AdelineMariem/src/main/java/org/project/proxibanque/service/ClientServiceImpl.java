package org.project.proxibanque.service;

import java.util.Collection;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.persistence.ClientDaoImpl;
import org.project.proxibanque.persistence.IClientDao;

public class ClientServiceImpl implements IClientService {

	private IClientDao dao = new ClientDaoImpl();

	@Override
	public Client getClient(Long id) {

		return dao.findClientById(id);
	}

	@Override
	public void addClient(Client client) {
		if (client != null) {
			dao.save(client);
		}
	}

	@Override
	public Collection<Client> getAllClients(Long codeCons) {
		return dao.getClients(codeCons);
	}

	@Override
	public void deleteClient(Client client) {
		// TODO Auto-generated method stub

	}

}
