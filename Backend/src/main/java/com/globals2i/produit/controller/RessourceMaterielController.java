package com.globals2i.produit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globals2i.produit.model.RessourceMateriel;
import com.globals2i.produit.service.RessourceMaterielService;

@RestController
@RequestMapping("/ressourceMateriel")
public class RessourceMaterielController {
	
	@Autowired
	private RessourceMaterielService ressourceMaterielService;
	
	
	@GetMapping
	public Page<RessourceMateriel> getAllRessourceMateriel(@RequestParam(defaultValue = "0") int page){
		return ressourceMaterielService.getAllRessourceMateriel(page);
		
	}
	@DeleteMapping("/{id}")
	public boolean deleteRessourceMateriel(@PathVariable Long id) {
		return ressourceMaterielService.deleteRessourceMateriel(id);
	}

	@PutMapping
	public RessourceMateriel updateRessourceMateriel(@RequestBody RessourceMateriel ressourceMateriel) {
		return ressourceMaterielService.updateRessourceMateriel(ressourceMateriel);
	}

	@PostMapping
	public RessourceMateriel createRessourceMateriel(@RequestBody RessourceMateriel ressourceMateriel) {
		return ressourceMaterielService.createRessourceMateriel(ressourceMateriel);
		}



}
