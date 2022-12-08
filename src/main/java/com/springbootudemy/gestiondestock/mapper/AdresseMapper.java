package com.springbootudemy.gestiondestock.mapper;

import com.springbootudemy.gestiondestock.dto.AdresseDto;
import com.springbootudemy.gestiondestock.model.Adresse;
import org.springframework.stereotype.Component;

@Component
public class AdresseMapper {

    public AdresseDto toRest(Adresse adresse) {
        return AdresseDto.builder()
                .adresse(adresse.getAdresse())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public Adresse toDomain(AdresseDto adresseDto) {
        return Adresse.builder()
                .adresse(adresseDto.getAdresse())
                .ville(adresseDto.getVille())
                .codePostale(adresseDto.getCodePostale())
                .pays(adresseDto.getPays())
                .build();
    }
}
