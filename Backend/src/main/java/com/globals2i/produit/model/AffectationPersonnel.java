package com.globals2i.produit.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.globals2i.produit.model.audit.AffectationPersonnelId;
import com.globals2i.produit.model.audit.DateAudit;

@Entity
public class AffectationPersonnel extends DateAudit {


	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AffectationPersonnelId pk = new AffectationPersonnelId();

	public AffectationPersonnelId getPk() {
		return pk;
	}

	public void setPk(AffectationPersonnelId pk) {
		this.pk = pk;
	}

	public AffectationPersonnel() {

	}

}
