package com.globals2i.produit.model;

import org.hibernate.annotations.NaturalId;
import javax.persistence.*;


@Entity
@Table(name = "profils")
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private ProfilName name;

    public Profil() {

    }

    public Profil(ProfilName name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfilName getName() {
        return name;
    }

    public void setName(ProfilName name) {
        this.name = name;
    }

}
