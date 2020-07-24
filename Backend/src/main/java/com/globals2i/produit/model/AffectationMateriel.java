package com.globals2i.produit.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.globals2i.produit.model.audit.AffectationMaterielId;
import com.globals2i.produit.model.audit.DateAudit;

@Entity
public class AffectationMateriel extends DateAudit {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AffectationMaterielId pk = new AffectationMaterielId();

	public AffectationMaterielId getPk() {
		return pk;
	}

	public void setPk(AffectationMaterielId pk) {
		this.pk = pk;
	}

	public AffectationMateriel() {

	}

}
