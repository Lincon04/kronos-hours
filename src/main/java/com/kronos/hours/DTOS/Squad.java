package com.kronos.hours.DTOS;

import lombok.Data;

import java.util.List;

@Data
public class Squad {

    private Integer id;
    private String nome;
    private List<UsuarioDTO> desenvolvedores;
    private ClienteEmpresa clienteEmpresa;

}
