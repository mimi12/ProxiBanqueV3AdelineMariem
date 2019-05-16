package org.project.proxibanque.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Attributs et méthodes relatifs aux Conseillers de ProxiBanque. La classe
 * contient une liste de clients, deux constructeurs ainsi que les getters et
 * setters.
 * 
 * @author Mariem et Adeline
 *
 */
@Entity
public class Conseiller implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseiller;
	private String nomConseiller;

	// Liste de clients gérés
	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Client> listClients = new HashSet<Client>();

	// Constructeurs
	public Conseiller() {
		super();
	}

	public Conseiller(String nomConseiller) {
		super();
		this.nomConseiller = nomConseiller;
	}

	// Getters et Setters
	public Long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNomConseiller() {
		return nomConseiller;
	}

	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}

	public Set<Client> getListClients() {
		return listClients;
	}

	public void setListClients(Set<Client> listClients) {
		this.listClients = listClients;
	}

	// ToString
	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nomConseiller=" + nomConseiller + "]";
	}

}
