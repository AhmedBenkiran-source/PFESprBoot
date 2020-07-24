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

import com.globals2i.produit.model.TypeTache;
import com.globals2i.produit.service.TypeTacheService;

@RestController
@RequestMapping("/typetache")
public class TypeTacheController {

	@Autowired
	private TypeTacheService typeTacheService;
	
	
	@GetMapping
	public Page<TypeTache> getAllTypeTache(@RequestParam(defaultValue = "0") int page){
		return typeTacheService.getAllTypeTache(page);
		
	}
	@DeleteMapping("/{id}")
	public boolean deleteTypeTache(@PathVariable Long id) {
		return typeTacheService.deleteTypeTache(id);
	}

	@PutMapping
	public TypeTache updateTypeTache(@RequestBody TypeTache typeTache) {
		return typeTacheService.updateTypeTache(typeTache);
	}

	@PostMapping
	public TypeTache createTypeTache(@RequestBody TypeTache typeTache) {
		return typeTacheService.createTypeTache(typeTache);
		}


	
}
