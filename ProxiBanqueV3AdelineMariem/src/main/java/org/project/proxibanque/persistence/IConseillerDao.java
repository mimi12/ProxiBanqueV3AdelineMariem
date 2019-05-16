package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

/**
 * Interface qui contient les signatures des méthodes save() et findConsById(), 
 * elle est implémenté par la classe {@link ConseillerDaoImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface IConseillerDao {

	/**
	 * Méthode qui permet de persister un objet de type {@link Conseiller} en base de données.
	 * @param cons
	 */
	public void save(Conseiller cons);

	/**
	 * Méthode qui permet de récupérer un conseiller par son id.
	 * @param idConseiller
	 * @return
	 */
	public Conseiller findConsById(Long idConseiller); // -

	/**
	 * @return
	 */
	public List<Conseiller> findAllCons();

}
