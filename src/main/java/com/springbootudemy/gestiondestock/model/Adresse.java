package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
// pour déclarer qu'une classe sera intégrée par d'autres entités.
@Embeddable
public class Adresse implements Serializable {

    private String adresse;

    private String ville;

    private String codePostale;

    private String pays;
}
