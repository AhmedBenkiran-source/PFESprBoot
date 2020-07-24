package com.globals2i.produit.model;

import java.sql.Date;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.globals2i.produit.model.audit.DateAudit;

@Entity
public class Tache  extends DateAudit{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String libelleTache;
	private Date debutTache;
	private Date finTache;
	private Boolean etatTache;
	@ManyToOne
	private Projet projet;

	@OneToMany
	@JsonManagedReference
	private Set<Tache> taches;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tacheByUsers", joinColumns = @JoinColumn(name = "tache_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Collection<Personnel> personnels;

	public Tache() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelleTache() {
		return libelleTache;
	}

	public void setLibelleTache(String libelleTache) {
		this.libelleTache = libelleTache;
	}

	public Date getDebutTache() {
		return debutTache;
	}

	public void setDebutTache(Date debutTache) {
		this.debutTache = debutTache;
	}

	public Date getFinTache() {
		return finTache;
	}

	public void setFinTache(Date finTache) {
		this.finTache = finTache;
	}

	public Boolean getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(Boolean etatTache) {
		this.etatTache = etatTache;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Collection<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	public Collection<Personnel> getUsers() {
		return personnels;
	}

	public void setUsers(Collection<Personnel> personnels) {
		this.personnels = personnels;
	}

}
