package org.project.proxibanque.entities;

import java.io.Serializable;
import java.util.ArrayList;
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

/**
 * Attributs et m�thodes relatifs aux Clients de ProxiBanque
 * 
 * @author Mariem et Chlo�
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeClient", discriminatorType = DiscriminatorType.STRING)
public class Client implements Serializable {

	// Attributs

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long idClient;
	protected String nomClient;
	protected String prenomClient;
	protected String adresse;
	protected Integer codePostal;
	protected String ville;
	protected String telephone;
	protected String emailClient;

	// Liste de comptes g�r�s
	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	protected List<Compte> listComptes = new ArrayList<Compte>();
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "conseiller_id")
	protected Conseiller conseiller;

	// Constructeurs

	public Client() {
		super();
	}

	public Client(String nomClient, String prenomClient, String adresse, Integer codePostal, String ville,
			String telephone) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}

	public Client(String nom, String prenom, String adresse, String mail) {
	}

	// Getters & Setters

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	// ToString

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", adresse=" + adresse + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone="
				+ telephone + "]";
	}

	public List<Compte> getListComptes() {
		return listComptes;
	}

	public void setListComptes(List<Compte> listComptes) {
		this.listComptes = listComptes;
	}

}
