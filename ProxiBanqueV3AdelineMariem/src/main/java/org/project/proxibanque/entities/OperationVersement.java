package org.project.proxibanque.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * la classe {@link OperationVersement} hérite de la classe {@link Operation}, 
 * elle contient deux constructeurs, un par défaut et un avec des paramètres.
 * 
 * @author Mariem et Adeline
 */
@Entity
@DiscriminatorValue("Versement")
public class OperationVersement extends Operation {
	// Constructeurs
	public OperationVersement() {
		super();
	}

	public OperationVersement(Date date, Double montant) {
		super(date, montant);
	}

}
