package com.springbootudemy.gestiondestock.repository;

import com.springbootudemy.gestiondestock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}
