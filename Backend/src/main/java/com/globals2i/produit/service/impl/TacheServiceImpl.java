package com.globals2i.produit.service.impl;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.globals2i.produit.model.Tache;
import com.globals2i.produit.repository.TacheRepository;
import com.globals2i.produit.service.TacheService;


@Service
@Transactional
public class TacheServiceImpl implements TacheService{
 
	@Autowired
	private TacheRepository tacheRepository;
	
	@Override
	public Page<Tache> getAllTache(int page){
		Pageable pageable = PageRequest.of(page, 4);
		return tacheRepository.findAll(pageable);
		
	}
	@Override
	public boolean deleteTache(Long id) {
		tacheRepository.deleteById(id);
		return true;
	}
	@Override
	public Tache updateTache(Tache tache) {
		return tacheRepository.save(tache);
	}
	@Override
	public Tache createTache(Tache tache) {
		return tacheRepository.save(tache);
	}
	
}
