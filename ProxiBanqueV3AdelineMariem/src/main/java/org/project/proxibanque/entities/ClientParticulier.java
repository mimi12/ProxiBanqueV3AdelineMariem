package org.project.proxibanque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * la classe {@link ClientParticulier} h�rite de la classe {@link Client}, elle
 * contient trois constructeurs, un par d�faut et deux autres avec des
 * param�tres.
 * 
 * @author Mariem et Adeline
 */
@Entity
@DiscriminatorValue("Particulier")
public class ClientParticulier extends Client {

	// Constructeurs

	public ClientParticulier() {
		super();
	}

	public ClientParticulier(String nomClient, String prenomClient, String adresse, Integer codePostal, String ville,
			String telephone) {
		super(nomClient, prenomClient, adresse, codePostal, ville, telephone);
	}

	public ClientParticulier(String nom, String prenom, String adresse, String mail) {
		super(nom, prenom, adresse, mail);
	}

}
