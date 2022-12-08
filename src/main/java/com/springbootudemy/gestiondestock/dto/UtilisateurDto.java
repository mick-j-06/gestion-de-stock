package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private Instant date_de_naissance;

    private String mote_de_passe;

    private AdresseDto adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;
}
