package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {
    private Integer id;

    private ArticleDto article;

    private Integer commande_fournisseur_id;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;
}
