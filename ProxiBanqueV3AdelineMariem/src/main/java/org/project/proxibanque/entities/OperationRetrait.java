package org.project.proxibanque.entities;

import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Attributs et m�thodes relatifs aux op�rations de retrait sur les comptes de
 * ProxiBanque
 * 
 * @author Mariem et Chlo�
 *
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
