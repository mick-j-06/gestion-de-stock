package com.springbootudemy.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numTel;

    private Integer id_entreprise;

    @JsonIgnore
    private List<CommandeFournisseurDto> commande_fournisseurs;
}
