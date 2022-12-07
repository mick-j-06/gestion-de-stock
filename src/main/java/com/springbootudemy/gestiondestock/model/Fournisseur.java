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

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur extends AbstractEntity {
    private String nom;

    private String prenom;

    // utilisée pour incorporer un type dans une autre entité.
    @Embedded
    private Adresse adresse;

    private String photo;

    private String mail;

    private String numeroTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;
}
