package com.springbootudemy.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import com.springbootudemy.gestiondestock.dto.CommandeClientDto;
import org.springframework.util.StringUtils;

public class CommandeClientValidator {


    public static List<String> validate(CommandeClientDto dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("Veuillez renseigner le code de la commande");
            errors.add("Veuillez renseigner la date de la commande");
            errors.add("Veuillez renseigner l'etat de la commande");
            errors.add("Veuillez renseigner le client");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getCode())) {
            errors.add("Veuillez renseigner le code de la commande");
        }
        if (dto.getDate_commande() == null) {
            errors.add("Veuillez renseigner la date de la commande");
        }

        if (dto.getClient_id() == null) {
            errors.add("Veuillez renseigner le client");
        }

        return errors;
    }

}
