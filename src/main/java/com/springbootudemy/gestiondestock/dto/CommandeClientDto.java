package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {
    private Integer id;

    private String code;

    private Instant date_commande;

    private Integer client_id;

    private List<LigneCommandeClientDto> ligne_commande_clients;
}
