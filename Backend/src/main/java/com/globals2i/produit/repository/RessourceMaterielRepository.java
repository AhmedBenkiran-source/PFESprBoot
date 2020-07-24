package com.globals2i.produit.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.globals2i.produit.model.RessourceMateriel;

public interface RessourceMaterielRepository extends JpaRepository<RessourceMateriel, Long> {

	Page<RessourceMateriel> findAll(Pageable pageable);

}
