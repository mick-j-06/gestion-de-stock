package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {
    private Integer id;

    private String code;

    private Instant dateCommande;

    private Integer fournisseur_id;

    private List<LigneCommandeFournisseurDto> ligne_commande_fournisseurs;
}
