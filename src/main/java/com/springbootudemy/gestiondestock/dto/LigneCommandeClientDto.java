package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {
    private Integer id;

    private ArticleDto article;

    private Integer commande_client_id;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
