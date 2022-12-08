package com.springbootudemy.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {
    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String code_fiscal;

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;
}
