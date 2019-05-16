package org.project.proxibanque.ws;

import java.util.Collection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.project.proxibanque.entities.Client;

@Produces({"application/xml", "application/json"})
public interface IProxiBanqueWS {
	
	@GET
	@Path("/clients/{id}")
	Client getClient(@PathParam("id") String id);
	
	@GET
	@Path("/clients/")
	Collection<Client> getAllClients();
	
	@PUT
	@Path("/clients/")
	Response updateClient(Client client);
	
	@POST
	@Path("/clients/")
	Response addClient(Client client);
	
	@DELETE
	@Path("/clients/{id}")
	Response deleteClient(@PathParam("id") Client client);


}
