package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

/**
 * Interface qui contient les signatures des m�thodes save() et findConsById(), 
 * elle est impl�ment� par la classe {@link ConseillerDaoImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface IConseillerDao {

	/**
	 * M�thode qui permet de persister un objet de type {@link Conseiller} en base de donn�es.
	 * @param cons
	 */
	public void save(Conseiller cons);

	/**
	 * M�thode qui permet de r�cup�rer un conseiller par son id.
	 * @param idConseiller
	 * @return
	 */
	public Conseiller findConsById(Long idConseiller); // -

	/**
	 * @return
	 */
	public List<Conseiller> findAllCons();

}
