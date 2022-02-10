package com.kronos.hours.DTOS;

import lombok.Data;

import java.util.List;

@Data
public class Empresa {
    private Integer id;
    private String razaoSocial;
    private String nomeComercial;
    private String cnpj;
    private List<UsuarioDTO> usuarios;
}
