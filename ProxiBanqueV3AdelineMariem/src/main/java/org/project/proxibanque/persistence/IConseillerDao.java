package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

/**
 * Interface qui contient les signatures des m�thodes save() et findConsById()
 * 
 * @author Mariem et Adeline
 *
 */
public interface IConseillerDao {

	public void save(Conseiller cons);

	public Conseiller findConsById(Long idConseiller); // -

	public List<Conseiller> findAllCons();

}
