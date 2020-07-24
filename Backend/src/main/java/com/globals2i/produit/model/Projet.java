package com.globals2i.produit.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titreProjet;
	private Date debutProjet;
	private Date finProjet;
	private Boolean etat;
	private String descriptionProjet;
	private String client;
	private String chefProjet;

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getChefProjet() {
		return chefProjet;
	}

	public void setChefProjet(String chefProjet) {
		this.chefProjet = chefProjet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitreProjet() {
		return titreProjet;
	}

	public void setTitreProjet(String titreProjet) {
		this.titreProjet = titreProjet;
	}

	
	public Date getDebutProjet() {
		return debutProjet;
	}

	public void setDebutProjet(Date debutProjet) {
		this.debutProjet = debutProjet;
	}

	public Date getFinProjet() {
		return finProjet;
	}

	public void setFinProjet(Date finProjet) {
		this.finProjet = finProjet;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public String getDescriptionProjet() {
		return descriptionProjet;
	}

	public void setDescriptionProjet(String descriptionProjet) {
		this.descriptionProjet = descriptionProjet;
	}

	public Projet() {
		super();
	}

}
