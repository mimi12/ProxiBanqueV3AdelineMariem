package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

public interface IConseillerService {

	
	public void ajouterConseiller(Conseiller conseiller);

	public Conseiller trouverConseillerParID(Long idConseiller);

	public List<Conseiller> listerLesConseillers();
	
}
