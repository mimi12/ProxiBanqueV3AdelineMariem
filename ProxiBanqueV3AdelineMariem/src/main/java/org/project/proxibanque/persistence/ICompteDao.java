package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Compte;

public interface ICompteDao {

	public void save(Compte cpt);

	public Compte findCptById(Long idCompte); 

	public List<Compte> findAllCpt();

	public void updateCompte(Compte compte);

	public void remove(Compte compte);
}
