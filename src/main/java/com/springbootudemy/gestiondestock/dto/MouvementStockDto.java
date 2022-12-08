package com.springbootudemy.gestiondestock.dto;

import com.springbootudemy.gestiondestock.model.SourceMouvementStock;
import com.springbootudemy.gestiondestock.model.TypeMouvementStock;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MouvementStockDto {
    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMouvementStock typeMvt;

    private SourceMouvementStock sourceMvt;
}
