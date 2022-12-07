package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utilisateur extends AbstractEntity {

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String moteDePasse;

    @Embedded
    private Adresse adresse;

    private String photo;

    @ManyToOne
    private Entreprise entreprise;

    @OneToMany
    private List<Role> roles;
}
