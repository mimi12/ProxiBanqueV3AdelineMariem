package org.project.proxibanque.ws;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.service.ClientServiceImpl;
import org.project.proxibanque.service.IClientService;

public class IProxiBanqueWSImpl implements IProxiBanqueWS {

	private IClientService serv = new ClientServiceImpl();

	@Override
	public Client getClient(String id) {
		return serv.getClient(Long.parseLong(id));
		
	}

	@Override
	public Collection<Client> getAllClients(Long codeCons) {
			return serv.getAllClients(codeCons);
	}

	@Override
	public Response updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response addClient(Client client) {
		serv.addClient(client);
		return Response.ok(client).build();
	}

	@Override
	public Response deleteClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}
