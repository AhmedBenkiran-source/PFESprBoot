package com.globals2i.produit.model.audit;

import javax.persistence.ManyToOne;

import com.globals2i.produit.model.Personnel;
import com.globals2i.produit.model.Tache;

public class AffectationPersonnelId implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Tache tache;
	
	@ManyToOne
	private Personnel personnel;


	public void setTache(Tache tache) {
		this.tache = tache;
	}


	public Personnel getPersonnel() {
		return personnel;
	}


	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}


	public Tache getTache() {
		return tache;
	}


	
}
