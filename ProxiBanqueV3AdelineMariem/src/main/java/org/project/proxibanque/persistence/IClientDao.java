package org.project.proxibanque.persistence;

import java.util.Collection;

import org.project.proxibanque.entities.Client;

/**
 * Interface qui contient les signatures des m�thodes save(), getClients(),
 * findClientById(), elle est impl�ment� par la classe {@link ClientDaoImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface IClientDao {

	/**
	 * M�thode qui permet de r�cup�rer un client par son id.
	 * @param id
	 * @return
	 */
	public Client findClientById(Long id);

	/**
	 * M�thode qui permet de r�cuperer une liste de clients � partir de la base de donn�es.
	 * @param codeCons
	 * @return
	 */
	public Collection<Client> getClients(Long codeCons);

	/**
	 * M�thode qui permet de persister un objet de type {@link Client} en base de donn�es.
	 * @param client
	 */
	public void save(Client client);

	/**
	 * @param client
	 */
	public void remove(Client client);

}
