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

import com.globals2i.produit.model.Projet;
import com.globals2i.produit.service.ProjetService;

@RestController
@RequestMapping("/projet")
public class ProjetController {
	@Autowired
	private ProjetService projetService;
	
	
	@GetMapping
	public Page<Projet> getAllProjet(@RequestParam(defaultValue = "0") int page){
		return projetService.getAllProjet(page);
		
	}
	@DeleteMapping("/{id}")
	public boolean deleteProjet(@PathVariable Long id) {
		return projetService.deleteProjet(id);
	}

	@PutMapping
	public Projet updateProjet(@RequestBody Projet projet) {
		return projetService.updateProjet(projet);
	}

	@PostMapping("/add")
	public Projet createProjet(@RequestBody Projet projet) {
		return projetService.createProjet(projet);
		}


	
}
