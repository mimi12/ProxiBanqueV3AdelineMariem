package org.project.proxibanque.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * la classe {@link ClientEntreprise} hérite de la classe {@link Client}, 
 * elle contient trois constructeurs, un par défaut et deux avec des paramètres.
 * 
 * @author Mariem et Adeline
 */
@Entity
@DiscriminatorValue("Entreprise")
public class ClientEntreprise extends Client {

	// Constructeurs
	public ClientEntreprise() {
		super();
	}

	public ClientEntreprise(String nomClient, String prenomClient, String adresse, Integer codePostal, String ville,
			String telephone) {
		super(nomClient, prenomClient, adresse, codePostal, ville, telephone);
	}

	public ClientEntreprise(String nom, String prenom, String adresse, String mail) {
		super(nom, prenom, adresse, mail);
	}

}
