package org.project.proxibanque.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * la classe {@link CompteEpargne} hérite de la classe {@link Compte}, un compte
 * de type {@link CompteEpargne} a comme attribut TAUXREMUNERATIONDEFAUT  qui a une
 * valeur statique par défaut de 0.03
 * 
 * @author Mariem et Adeline
 */
@Entity
@DiscriminatorValue("C_Epargne")
public class CompteEpargne extends Compte {
	// Attributs
	private static final double TAUXREMUNERATIONDEFAUT = 0.03;

	// Getters et Setters
	public static double getTauxremunerationdefaut() {
		return TAUXREMUNERATIONDEFAUT;
	}
	public CompteEpargne() {
		super();

	}

	public CompteEpargne(double soldeCompte, Date dateOuvertCompte) {

		super(soldeCompte, dateOuvertCompte);
	}

	
//	@Override
//	public String toString() {
//		return "CompteEpargne [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertCompte="
//				+ dateOuvertCompte + ", client=" + client + ", listOperations=" + listOperations + "]";
//	}

}
