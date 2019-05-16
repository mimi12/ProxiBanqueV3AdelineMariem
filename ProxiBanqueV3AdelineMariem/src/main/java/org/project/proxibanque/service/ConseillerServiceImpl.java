package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Conseiller;
import org.project.proxibanque.persistence.ConseillerDaoImpl;
import org.project.proxibanque.persistence.IConseillerDao;

public class ConseillerServiceImpl implements IConseillerService {

	private IConseillerDao dao = new ConseillerDaoImpl();

	@Override
	public void ajouterConseiller(Conseiller conseiller) {
		if (conseiller != null) {
			dao.save(conseiller);
		}

	}

	@Override
	public Conseiller trouverConseillerParID(Long idConseiller) {

		return dao.findConsById(idConseiller);
	}

	@Override
	public List<Conseiller> listerLesConseillers() {
		return dao.findAllCons();
	}

}
