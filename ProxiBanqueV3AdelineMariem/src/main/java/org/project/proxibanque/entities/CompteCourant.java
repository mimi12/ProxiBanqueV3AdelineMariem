package org.project.proxibanque.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * la classe {@link CompteCourant} hérite de la classe {@link Compte} un compte
 * de type {@link CompteCourant} a comme attribut autorisationDecouvet qui a une
 * valeur statique par défaut 1000
 * 
 * @author Mariem et Adeline
 */
@Entity
@DiscriminatorValue("C_Courant")
public class CompteCourant extends Compte {

	// Attributs
	private static final Double AUTORISATIONDECOUVERT = 1000.0;

	public CompteCourant() {
		super();

	}

	public CompteCourant(Double soldeCompte, Date dateOuvertCompte) {

		super(soldeCompte, dateOuvertCompte);
	}

	public static Double getAutorisationdecouvert() {
		return AUTORISATIONDECOUVERT;
	}

//	@Override
//	public String toString() {
//		return "CompteCourant [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertCompte="
//				+ dateOuvertCompte + ", client=" + client + ", listOperations=" + listOperations + "]";
//	}

}
