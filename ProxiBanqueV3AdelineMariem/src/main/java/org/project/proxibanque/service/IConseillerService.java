package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;

/**
 * Interface qui contient les signatures des m�thodes suivantes
 * ajouterConseiller(), trouverConseillerParID() et listerLesConseillers(),
 * cette interface est impl�ment� par la classe {@link ConseillerServiceImpl}
 * 
 * @author Mariem et Adeline
 *
 */
public interface IConseillerService {

	/**
	 * M�thode qui permet d'ajouter un conseiller
	 * @param conseiller
	 */
	public void ajouterConseiller(Conseiller conseiller);

	/**
	 * M�thode qui permet de r�cup�rer un conseiller par son id
	 * @param idConseiller
	 * @return
	 */
	public Conseiller trouverConseillerParID(Long idConseiller);

	/**
	 * M�thode qui permet de r�cup�rer la liste des conseillers
	 * @return
	 */
	public List<Conseiller> listerLesConseillers();

}
