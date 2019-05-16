package org.project.proxibanque.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et m�thodes relatifs aux op�rations de versement sur les comptes de
 * ProxiBanque
 * 
 * @author Mariem et Chlo�
 *
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
