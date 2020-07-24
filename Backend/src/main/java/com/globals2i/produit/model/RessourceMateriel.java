package com.globals2i.produit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RessourceMateriel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long num_Serie;
	private String caracteristique;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNum_Serie() {
		return num_Serie;
	}
	public void setNum_Serie(Long num_Serie) {
		this.num_Serie = num_Serie;
	}
	public String getCaracteristique() {
		return caracteristique;
	}
	public void setCaracteristique(String caracteristique) {
		this.caracteristique = caracteristique;
	}
	public RessourceMateriel() {
		super();
	}
	
	
	
}
