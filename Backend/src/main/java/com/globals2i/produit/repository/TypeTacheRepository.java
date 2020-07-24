package com.globals2i.produit.repository;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globals2i.produit.model.TypeTache;

@Repository
public interface TypeTacheRepository extends JpaRepository<TypeTache, Long>{
    Page<TypeTache> findAll(Pageable pageable);

}
