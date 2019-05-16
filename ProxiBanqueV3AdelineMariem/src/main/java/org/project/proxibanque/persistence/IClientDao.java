package org.project.proxibanque.persistence;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

/**
 * Interface qui contient les signatures des méthodes save(), getClients(),
 * findClientById(), elle est implémenté par la classe {@link ClientDaoImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface IClientDao {

	/**
	 * Méthode qui permet de récupérer un client par son id.
	 * @param id
	 * @return
	 */
	public Client findClientById(Long id);

	/**
	 * Méthode qui permet de récuperer une liste de clients à partir de la base de données.
	 * @param codeCons
	 * @return
	 */
	public Collection<Client> getClients(Long codeCons);

	/**
	 * Méthode qui permet de persister un objet de type {@link Client} en base de données.
	 * @param client
	 */
	public void save(Client client);

	/**
	 * @param client
	 */
	public void remove(Client client);

}
