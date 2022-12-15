package com.springbootudemy.gestiondestock.repository;

import java.math.BigDecimal;
import java.util.List;

import com.springbootudemy.gestiondestock.model.MouvementStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MvtStkRepository extends JpaRepository<MouvementStock, Integer> {

  @Query("select sum(m.quantite) from MouvementStock m where m.article.id = :idArticle")
  BigDecimal stockReelArticle(@Param("id_article") Integer idArticle);

  List<MouvementStock> findAllByArticleId(Integer idArticle);

}
