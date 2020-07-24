package com.globals2i.produit.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.globals2i.produit.model.Projet;
import com.globals2i.produit.repository.ProjetRepository;
import com.globals2i.produit.service.ProjetService;

@Service
@Transactional
public class ProjetServiceImpl implements ProjetService {
	
	@Autowired
	private ProjetRepository projetRepository;
	
	@Override
	public Page<Projet> getAllProjet(int page){
		Pageable pageable = PageRequest.of(page, 4);
		return projetRepository.findAll(pageable);
		
	}
	@Override
	public boolean deleteProjet(Long id) {
		projetRepository.deleteById(id);
		return true;
	}
	@Override
	public Projet updateProjet(Projet projet) {
		return projetRepository.save(projet);
	}
	@Override
	public Projet createProjet(Projet projet) {
		return projetRepository.save(projet);
	}


}
