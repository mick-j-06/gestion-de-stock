package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ArticleDto {
    private Integer id;

    private String code_article;

    private String designation;

    private BigDecimal prix_unitaire_ht;

    private BigDecimal taux_tva;

    private BigDecimal prix_unitaire_ttc;

    private String photo;

    private Integer category_id;

    private Integer id_entreprise;
}
