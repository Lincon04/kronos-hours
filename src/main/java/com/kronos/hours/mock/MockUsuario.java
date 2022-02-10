package com.kronos.hours.mock;

import com.kronos.hours.DTOS.UsuarioDTO;

import java.util.ArrayList;
import java.util.List;

public class MockUsuario {
    static UsuarioDTO usuario = new UsuarioDTO();
    static UsuarioDTO usuario2 = new UsuarioDTO();
    static UsuarioDTO usuario3 = new UsuarioDTO();

    static public void preencherDados(){
        MockUsuario.usuario.setId(1);
        MockUsuario.usuario.setNome("usuario-1");
        MockUsuario.usuario.setEmail("usuario-1@email1.com");
        MockUsuario.usuario.setPerfil(1);

        MockUsuario.usuario.setId(2);
        MockUsuario.usuario2.setNome("usuario-2");
        MockUsuario.usuario2.setEmail("usuario-2@email2.com");
        MockUsuario.usuario2.setPerfil(2);

        MockUsuario.usuario.setId(3);
        MockUsuario.usuario3.setNome("usuario-3");
        MockUsuario.usuario3.setEmail("usuario-3@email3.com");
        MockUsuario.usuario3.setPerfil(3);

    }

    public static List<UsuarioDTO> getAllUsuarios() {
        MockUsuario.preencherDados();
        List<UsuarioDTO> listUsuarios = new ArrayList<>();

        listUsuarios.add(usuario);
        listUsuarios.add(usuario2);
        listUsuarios.add(usuario3);
        return listUsuarios;
    }

    public static UsuarioDTO getUsuarioPorId(Integer id){

        for (UsuarioDTO u : getAllUsuarios()) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

}
