package com.springbootudemy.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Écouteur d'entité JPA pour capturer les informations d'audit sur les entités persistantes et mises à jour.
@EntityListeners(AuditingEntityListener.class)
// Désigne une classe dont les informations de mappage sont appliquées aux entités qui en héritent. Une superclasse mappée n'a pas de table distincte définie pour elle.
@MappedSuperclass
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant creationDate;

    @LastModifiedDate
    private Instant lastModifiedDate;
}
