package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Compte;

/**
 * Interface contenant les signatures des m�thodes save(), findCptById() et
 * findAllCpt(). Elle est impl�ment�e par la classe {@link CompteDaoImpl}.
 * 
 * @author Mariem et Adeline
 *
 */
public interface ICompteDao {

	/**
	 * M�thode permettant de persister un objet compte en base de donn�es.
	 * 
	 * @param cpt
	 */
	public void save(Compte cpt);

	/**
	 * M�thode permettant de r�cup�rer un compte via son idCompte.
	 * 
	 * @param idCompte
	 * @return
	 */
	public Compte findCptById(Long idCompte);

	/**
	 * M�thode permettant de r�cup�rer la liste des comptes.
	 * 
	 * @return
	 */
	public List<Compte> findAllCpt(Long codClient);

	public void remove(Compte compte);
}
