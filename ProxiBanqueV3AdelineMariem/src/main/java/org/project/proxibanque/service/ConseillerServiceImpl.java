package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;
import org.project.proxibanque.persistence.ConseillerDaoImpl;
import org.project.proxibanque.persistence.IConseillerDao;

/**
 * Classe qui impl�mente les m�thodes de l'int�rface {@link IConseillerService},
 * ces m�thodes sont ajouterConseille(), trouverConseillerParID() et
 * listerLesConseillers()
 * 
 * @author Adminl
 *
 */
public class ConseillerServiceImpl implements IConseillerService {

	private IConseillerDao dao = new ConseillerDaoImpl();

	/**
	 * M�thode qui permet d'ajouter un conseiller
	 */
	@Override
	public void ajouterConseiller(Conseiller conseiller) {
		if (conseiller != null) {
			dao.save(conseiller);
		}

	}

	/**
	 * M�thode qui permet de r�cup�rer un conseiller par son id
	 */
	@Override
	public Conseiller trouverConseillerParID(Long idConseiller) {

		return dao.findConsById(idConseiller);
	}

	/**
	 * M�thode qui permet de r�cup�rer la liste des conseillers
	 */
	@Override
	public List<Conseiller> listerLesConseillers() {
		return dao.findAllCons();
	}

}
