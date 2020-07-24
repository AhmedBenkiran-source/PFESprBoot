package com.globals2i.produit.service;

import org.springframework.data.domain.Page;


import com.globals2i.produit.model.Tache;


public interface TacheService {
	
public Page<Tache> getAllTache(int page);
	
	public boolean deleteTache( Long id) ;

	public Tache updateTache( Tache tache) ;

	public Tache createTache(Tache tache);
	
}
