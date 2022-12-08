package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Client extends AbstractEntity implements Serializable {
    private String nom;

    private String prenom;

    // utilisée pour incorporer un type dans une autre entité.
    @Embedded
    private Adresse adresse;

    private String photo;

    private String mail;

    private String numeroTel;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}
