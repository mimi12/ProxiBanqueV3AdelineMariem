package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

/**
 * Interface qui contient les signatures des méthodes suivantes
 * ajouterConseiller(), trouverConseillerParID() et listerLesConseillers(),
 * cette interface est implémenté par la classe {@link ConseillerServiceImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface IConseillerService {

	/**
	 * Méthode qui permet d'ajouter un conseiller
	 * @param conseiller
	 */
	public void ajouterConseiller(Conseiller conseiller);

	/**
	 * Méthode qui permet de récupérer un conseiller par son id
	 * @param idConseiller
	 * @return
	 */
	public Conseiller trouverConseillerParID(Long idConseiller);

	/**
	 * Méthode qui permet de récupérer la liste des conseillers
	 * @return
	 */
	public List<Conseiller> listerLesConseillers();

}
