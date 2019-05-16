package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Compte;

/**
 * Interface contenant les signatures des méthodes save(), findCptById() et
 * findAllCpt(). Elle est implémentée par la classe {@link CompteDaoImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface ICompteDao {

	/**
	 * Méthode permettant de persister un objet compte en base de données.
	 * 
	 * @param cpt
	 */
	public void save(Compte cpt);

	/**
	 * Méthode permettant de récupérer un compte via son idCompte.
	 * 
	 * @param idCompte
	 * @return
	 */
	public Compte findCptById(Long idCompte);

	/**
	 * Méthode permettant de récupérer la liste des comptes.
	 * 
	 * @return
	 */
	public List<Compte> findAllCpt(Long codClient);

	public void remove(Compte compte);
}
