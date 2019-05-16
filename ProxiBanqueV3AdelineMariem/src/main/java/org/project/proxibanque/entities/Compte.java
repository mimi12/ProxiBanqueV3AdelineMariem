package org.project.proxibanque.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Classe {@link Compte} contient les attributs d'un compte générale que ça soit
 * un {@link CompteCourant} ou {@link CompteEpargne} ainsi la classe contient
 * une référence vers le client concerné par le compte.
 * 
 * @author Mariem et Adeline
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeCompte", discriminatorType = DiscriminatorType.STRING)
public class Compte {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long numCompte;
	protected Double soldeCompte;
	protected Date dateOuvertCompte;

	@XmlTransient
	@ManyToOne
	@JoinColumn(name = "client_id")
	protected Client client;

	// Liste des operations
	@XmlTransient
	@OneToMany(mappedBy = "compte")
	protected List<Operation> listOperations = new ArrayList<Operation>();

	// Constructeurs
	public Compte() {
		super();
	}

	public Compte(Double soldeCompte, Date dateOuvertCompte) {
		super();
		this.soldeCompte = soldeCompte;
		this.dateOuvertCompte = dateOuvertCompte;
	}

	// Getters et Setters
	public Long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}

	public Double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Date getDateOuvertCompte() {
		return dateOuvertCompte;
	}

	public void setDateOuvertCompte(Date dateOuvertCompte) {
		this.dateOuvertCompte = dateOuvertCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getListOperations() {
		return listOperations;
	}

	public void setListOperations(List<Operation> listOperations) {
		this.listOperations = listOperations;
	}

	// ToString
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + ", dateOuvertCompte="
				+ dateOuvertCompte + "]";
	}

}
