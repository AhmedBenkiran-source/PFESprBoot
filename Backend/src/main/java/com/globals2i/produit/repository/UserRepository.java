package com.globals2i.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globals2i.produit.model.Personnel;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Personnel, Long> {
    Optional<Personnel> findByEmail(String email);

    Optional<Personnel> findByUsernameOrEmail(String username, String email);

    List<Personnel> findByIdIn(List<Long> userIds);

    Optional<Personnel> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
