package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.UsuarioDTO;
import com.kronos.hours.mock.MockUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UsuarioController {

    @GetMapping(value = "/usuario")
    private List<UsuarioDTO> getAllUsuarios(){
        return MockUsuario.getAllUsuarios();
    }

    @GetMapping("/usuario/{id}")
    private UsuarioDTO getUsuario(@PathVariable Integer id) {

        return MockUsuario.getUsuarioPorId(id);
    }

    @PostMapping("/usuario")
    private UsuarioDTO save(@RequestBody UsuarioDTO usuario) {
        return usuario;
    }

    @DeleteMapping("/usuario/{id}")
    private void delete(@PathVariable Integer id) {
        MockUsuario.getUsuarioPorId(id);
    }

    @PutMapping("/usuario/{id}")
    private UsuarioDTO update(@RequestBody UsuarioDTO usuario) {
        return  MockUsuario.getUsuarioPorId(usuario.getId());
    }
}
