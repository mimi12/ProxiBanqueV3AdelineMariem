package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.persistence.CompteDaoImpl;
import org.project.proxibanque.persistence.ICompteDao;

public class CompteServiceImpl implements ICompteService {

	private ICompteDao dao = new CompteDaoImpl();

	@Override
	public void ajouterCompte(Compte compte) {
		if (compte != null) {
			dao.save(compte);
		}

	}

	@Override
	public Compte trouverCompteParID(Long idCompte) {

		return dao.findCptById(idCompte);
	}

	@Override
	public List<Compte> listerLesComptes(Long codClient) {

		return dao.findAllCpt(codClient);
	}

}
