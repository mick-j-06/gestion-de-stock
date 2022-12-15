package com.springbootudemy.gestiondestock.repository;

import java.util.List;
import java.util.Optional;

import com.springbootudemy.gestiondestock.model.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur, Integer> {

  Optional<CommandeFournisseur> findCommandeFournisseurByCode(String code);

  List<CommandeFournisseur> findAllByFournisseurId(Integer id);
}
