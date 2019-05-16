package org.project.proxibanque.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Classe {@link Operation} contient les attributs d'une opération générale que ça soit
 * une opération de type  {@link OperationRetrait} ou de type  {@link OperationVersement},
 * elle fait aussi référence au compte du client concerné par l'opération.
 * 
 * @author Mariem et Adeline
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeOperation", discriminatorType = DiscriminatorType.STRING)
public class Operation {
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long idOperation;

	@XmlTransient
	@ManyToOne (cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "compte_id", unique = true)
	protected Compte compte;
	
	protected Date dateOperation;
	protected Double montant;

	// Constructeurs
	public Operation(Long idOperation) {
		super();
		this.idOperation = idOperation;
	}

	public Operation(Date dateOperation, Double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public Operation() {
		super();
	}

	// Getters et Setters
	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Operation [idOperation=" + idOperation + ", compte=" + compte + "]";
	}

	// ToString

}
