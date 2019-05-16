package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;
import org.project.proxibanque.persistence.ConseillerDaoImpl;
import org.project.proxibanque.persistence.IConseillerDao;

/**
 * Classe qui implémente les méthodes de l'intérface {@link IConseillerService},
 * ces méthodes sont ajouterConseille(), trouverConseillerParID() et
 * listerLesConseillers()
 * 
 * @author Adminl
 *
 */
public class ConseillerServiceImpl implements IConseillerService {

	private IConseillerDao dao = new ConseillerDaoImpl();

	/**
	 * Méthode qui permet d'ajouter un conseiller
	 */
	@Override
	public void ajouterConseiller(Conseiller conseiller) {
		if (conseiller != null) {
			dao.save(conseiller);
		}

	}

	/**
	 * Méthode qui permet de récupérer un conseiller par son id
	 */
	@Override
	public Conseiller trouverConseillerParID(Long idConseiller) {

		return dao.findConsById(idConseiller);
	}

	/**
	 * Méthode qui permet de récupérer la liste des conseillers
	 */
	@Override
	public List<Conseiller> listerLesConseillers() {
		return dao.findAllCons();
	}

}
