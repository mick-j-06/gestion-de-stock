package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MouvementStock extends AbstractEntity {

    private Instant dateMvt;

    private BigDecimal quantite;

    @ManyToOne
    private Article article;

    @Enumerated(EnumType.STRING)
    private TypeMouvementStock typeMvt;

    @Enumerated(EnumType.STRING)
    private SourceMouvementStock sourceMvt;

    private Integer idEntreprise;
}

