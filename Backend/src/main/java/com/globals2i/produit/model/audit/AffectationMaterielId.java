package com.globals2i.produit.model.audit;

import javax.persistence.ManyToOne;

import com.globals2i.produit.model.RessourceMateriel;
import com.globals2i.produit.model.Tache;

public class AffectationMaterielId implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Tache tache;
	
	@ManyToOne
	private RessourceMateriel ressourceMateriel;


	public void setTache(Tache tache) {
		this.tache = tache;
	}

	public Tache getTache() {
		return tache;
	}

	public RessourceMateriel getRessourceMateriel() {
		return ressourceMateriel;
	}

	public void setRessourceMateriel(RessourceMateriel ressourceMateriel) {
		this.ressourceMateriel = ressourceMateriel;
	}
	
	
}
