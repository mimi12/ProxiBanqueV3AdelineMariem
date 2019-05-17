package org.project.proxibanque.ws;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.project.proxibanque.entities.Client;
import org.project.proxibanque.service.ClientServiceImpl;
import org.project.proxibanque.service.IClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IProxiBanqueWSImpl implements IProxiBanqueWS {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImpl.class);
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
	public Response updateClient(Client updateClient) {
		Client client = serv.getClient(updateClient.getIdClient());
		Response response = null;
		if (client != null) {
			serv.updateClient(updateClient.getIdClient(), updateClient);
			response = Response.ok(updateClient).build();
			LOGGER.info("Client mis à jour");
		}else {
			response = Response.notModified().build();
			LOGGER.warn("Client non modifié");
			
		}
		return response;
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
