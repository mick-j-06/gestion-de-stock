package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LigneVente extends AbstractEntity {

    @ManyToOne
    private Vente vente;

    @ManyToOne
    private Article article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}