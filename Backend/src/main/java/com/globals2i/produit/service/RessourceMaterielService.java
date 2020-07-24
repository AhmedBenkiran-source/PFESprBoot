package com.globals2i.produit.service;

import org.springframework.data.domain.Page;

import com.globals2i.produit.model.RessourceMateriel;

public interface RessourceMaterielService {

	public Page<RessourceMateriel> getAllRessourceMateriel(int page);
	
	public boolean deleteRessourceMateriel( Long id) ;

	public RessourceMateriel updateRessourceMateriel( RessourceMateriel ressourceMateriel) ;

	public RessourceMateriel createRessourceMateriel(RessourceMateriel ressourceMateriel);
}
