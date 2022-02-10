package com.kronos.hours.DTOS;

import lombok.Data;

@Data
public class UsuarioDTO {

    private Integer Id;
    private String nome;
    private String email;
    private String senha;
    private Integer perfil;
}
