package com.globals2i.produit.service.impl;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.globals2i.produit.model.TypeTache;
import com.globals2i.produit.repository.TypeTacheRepository;
import com.globals2i.produit.service.TypeTacheService;

@Service
@Transactional
public class TypeTacheServiceImpl implements TypeTacheService{

	@Autowired
	private TypeTacheRepository typeTacheRepository;
	
	@Override
	public Page<TypeTache> getAllTypeTache(int page){
		Pageable pageable = PageRequest.of(page, 4);
		return typeTacheRepository.findAll(pageable);
		
	}
	@Override
	public boolean deleteTypeTache(Long id) {
		typeTacheRepository.deleteById(id);
		return true;
	}
	@Override
	public TypeTache updateTypeTache(TypeTache typeTache) {
		return typeTacheRepository.save(typeTache);
	}
	@Override
	public TypeTache createTypeTache(TypeTache typeTache) {
		return typeTacheRepository.save(typeTache);
	}

}
