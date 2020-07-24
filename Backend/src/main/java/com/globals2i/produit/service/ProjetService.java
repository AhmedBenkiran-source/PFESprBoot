package com.globals2i.produit.service;

import org.springframework.data.domain.Page;

import com.globals2i.produit.model.Projet;

public interface ProjetService {

public Page<Projet> getAllProjet(int page);
	
	public boolean deleteProjet( Long id) ;

	public Projet updateProjet( Projet projet) ;

	public Projet createProjet(Projet projet);
	
}
