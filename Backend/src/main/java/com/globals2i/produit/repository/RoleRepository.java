package com.globals2i.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globals2i.produit.model.Profil;
import com.globals2i.produit.model.ProfilName;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Profil, Long> {
    Optional<Profil> findByName(ProfilName profilName);
}
