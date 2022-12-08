package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VenteDto {
    private Integer id;

    private String code;

    private Instant date_vente;

    private String commentaire;

    private List<LigneVenteDto> ligne_ventes;
}
