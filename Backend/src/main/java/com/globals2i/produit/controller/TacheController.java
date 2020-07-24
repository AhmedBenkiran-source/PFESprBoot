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

import com.globals2i.produit.model.Tache;
import com.globals2i.produit.service.TacheService;


@RestController
@RequestMapping("/tache")
public class TacheController {
	@Autowired
	private TacheService tacheService;
	
	
	@GetMapping
	public Page<Tache> getAllTache(@RequestParam(defaultValue = "0") int page){
		return tacheService.getAllTache(page);
		
	}
	@DeleteMapping("/{id}")
	public boolean deleteTache(@PathVariable Long id) {
		return tacheService.deleteTache(id);
	}

	@PutMapping
	public Tache updateTache(@RequestBody Tache tache) {
		return tacheService.updateTache(tache);
	}

	@PostMapping
	public Tache createTache(@RequestBody Tache tache) {
		return tacheService.createTache(tache);
		}


}
