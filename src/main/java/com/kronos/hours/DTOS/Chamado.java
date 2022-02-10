package com.kronos.hours.DTOS;

import lombok.Data;

@Data
public class Chamado {

    private Integer id;
    private UsuarioDTO responsavel;
    private UsuarioDTO relator;
    private String dataAbertura;
    private String horasAtuacao;
    private String dataAtendimento;
    private String dataEncerramento;
    private Sistemas sistema;
    private Integer status;
}
