package org.project.proxibanque.service;

import java.util.Date;

import org.project.proxibanque.entities.Compte;
import org.project.proxibanque.entities.Operation;
import org.project.proxibanque.entities.OperationRetrait;
import org.project.proxibanque.entities.OperationVersement;
import org.project.proxibanque.persistence.CompteDaoImpl;
import org.project.proxibanque.persistence.ICompteDao;
import org.project.proxibanque.persistence.IOperationDao;
import org.project.proxibanque.persistence.OperationDaoImpl;

/**
 * Classe qui impl�mente les m�thodes relatives aux op�rations effectu�es par le
 * conseiller telles que le versement, le retrait et le virement. Elle
 * impl�mente l'interface {@link IOperationService}. On fait �galement le lien
 * entre les couches service et persistence.
 * 
 * @author Mariem et Adeline
 *
 */
public class OperationServiceImpl implements IOperationService {

	private IOperationDao dao1 = new OperationDaoImpl();
	private ICompteDao dao2 = new CompteDaoImpl();

	/**
	 * M�thode permettant de verser un montant sur le compte client via son num�ro
	 * de compte.
	 */
	@Override
	public void verser(Long numCompte, Double montant) {

		Compte compte = dao2.findCptById(numCompte);
		compte.setSoldeCompte(compte.getSoldeCompte() + montant);
		dao1.addOperation(new OperationVersement(new Date(), montant), numCompte);

	}

	/**
	 * M�thode permettant de retirer un montant sur le compte client via son num�ro
	 * de compte.
	 */
	@Override
	public void retirer(Long numCompte, Double montant) {

		Compte compte = dao2.findCptById(numCompte);
		compte.setSoldeCompte(compte.getSoldeCompte() - montant);
		dao1.addOperation(new OperationRetrait(new Date(), montant), numCompte);

	}

	/**
	 * M�thode permettant d'effectuer le virement d'un montant de compte � compte
	 * via les num�ros de compte. On fait appel ici aux m�thodes pr�c�dentes
	 * verser() et retirer().
	 */
	@Override
	public void effectuerVirement(Long numCompte1, Long numCompte2, Double montant) {

		retirer(numCompte1, montant);
		verser(numCompte2, montant);

	}

	@Override
	public void recupererOperations(Long numCompte) {
		dao1.consulterOperation(numCompte);
		
	}

}
