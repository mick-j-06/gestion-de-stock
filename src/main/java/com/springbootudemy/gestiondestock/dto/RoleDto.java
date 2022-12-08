package com.springbootudemy.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {
    private Integer id;

    private String role_name;

    @JsonIgnore
    private UtilisateurDto utilisateur;
}
