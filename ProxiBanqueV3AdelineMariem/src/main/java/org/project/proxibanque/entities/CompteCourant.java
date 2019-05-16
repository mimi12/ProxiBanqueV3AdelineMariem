package org.project.proxibanque.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et m�thodes relatifs aux Comptes Courants des clients ProxiBanque
 * 
 * @author Mariem et Chlo�
 *
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

	@Override
	public String toString() {
		return "CompteCourant [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertCompte="
				+ dateOuvertCompte + ", client=" + client + ", listOperations=" + listOperations + "]";
	}

}
