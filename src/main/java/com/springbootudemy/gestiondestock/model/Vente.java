package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Entity;
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
public class Vente extends AbstractEntity {

    private String code;

    private Instant dateVente;

    private String commentaire;

    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;
}
