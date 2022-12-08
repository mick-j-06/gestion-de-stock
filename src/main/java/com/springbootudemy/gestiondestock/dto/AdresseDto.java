package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {
    private String adresse;

    private String ville;

    private String codePostale;

    private String pays;
}
