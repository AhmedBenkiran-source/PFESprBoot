package com.globals2i.produit.service;

import org.springframework.data.domain.Page;

import com.globals2i.produit.model.TypeTache;

public interface TypeTacheService {

	public Page<TypeTache> getAllTypeTache(int page);
	
	public boolean deleteTypeTache( Long id) ;

	public TypeTache updateTypeTache( TypeTache typeTache) ;

	public TypeTache createTypeTache(TypeTache typeTache);
}
