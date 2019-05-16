package org.project.proxibanque.entities;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * la classe {@link OperationRetrait} hérite de la classe {@link Operation},
 * elle contient deux constructeurs, un par défaut et un autre avec des
 * paramètres.
 * 
 * @author Mariem et Adeline
 */
@Entity
@DiscriminatorValue("Retrait")
public class OperationRetrait extends Operation {
	// Constructeurs

	public OperationRetrait() {
		super();
	}

	public OperationRetrait(Date date, Double montant) {
		super(date, montant);
	}

}
