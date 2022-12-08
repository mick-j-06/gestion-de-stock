package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;

    private Integer vente_id;

    private ArticleDto article;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;
}
