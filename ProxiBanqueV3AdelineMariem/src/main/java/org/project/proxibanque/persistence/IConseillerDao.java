package org.project.proxibanque.persistence;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

public interface IConseillerDao {
	 
	// Conseiller

		public void save(Conseiller cons);

		public Conseiller findConsById(Long idConseiller); // -

		public List<Conseiller> findAllCons();


		

}
