package com.springbootudemy.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
    private Integer id;

    private String code;

    private String designation;
}
