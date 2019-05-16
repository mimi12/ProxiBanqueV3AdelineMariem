package org.project.proxibanque.service;

import java.util.List;

import org.project.proxibanque.entities.Compte;

public interface ICompteService {

	public void ajouterCompte(Compte compte);

	public Compte trouverCompteParID(Long idCompte);

	public List<Compte> listerLesComptes(Long codClient);

}
