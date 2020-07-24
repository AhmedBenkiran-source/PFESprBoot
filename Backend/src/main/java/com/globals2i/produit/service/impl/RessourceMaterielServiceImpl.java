package com.globals2i.produit.service.impl;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.globals2i.produit.model.RessourceMateriel;
import com.globals2i.produit.repository.RessourceMaterielRepository;
import com.globals2i.produit.service.RessourceMaterielService;

@Service
@Transactional
public class RessourceMaterielServiceImpl implements RessourceMaterielService{
	
	
	@Autowired
	private RessourceMaterielRepository ressourceMaterielRepository;
	
	@Override
	public Page<RessourceMateriel> getAllRessourceMateriel(int page){
		Pageable pageable = PageRequest.of(page, 4);
		return ressourceMaterielRepository.findAll(pageable);
		
	}
	@Override
	public boolean deleteRessourceMateriel(Long id) {
		ressourceMaterielRepository.deleteById(id);
		return true;
	}
	@Override
	public RessourceMateriel updateRessourceMateriel(RessourceMateriel ressourceMateriel) {
		return ressourceMaterielRepository.save(ressourceMateriel);
	}
	@Override
	public RessourceMateriel createRessourceMateriel(RessourceMateriel ressourceMateriel) {
		return ressourceMaterielRepository.save(ressourceMateriel);
	}
	
}
