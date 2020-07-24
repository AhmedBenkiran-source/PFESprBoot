package com.globals2i.produit.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	private Set<RendezVous> rendezvous;

	
	public Agenda() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<RendezVous> getRendezvous() {
		return rendezvous;
	}

	public void setRendezvous(Set<RendezVous> rendezvous) {
		this.rendezvous = rendezvous;
	}
	
	
}
