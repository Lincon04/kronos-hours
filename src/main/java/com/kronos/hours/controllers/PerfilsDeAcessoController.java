package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.PerfisDeAcesso;
import com.kronos.hours.mock.MockPerfilDeAcesso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PerfilsDeAcessoController {

    @GetMapping(value = "/Perfil")
    private List<PerfisDeAcesso> getAllPerfisDeAcesso(){
        return MockPerfilDeAcesso.getAll();
    }

    @GetMapping("/Perfil/{id}")
    private PerfisDeAcesso getPerfisDeAcesso(@PathVariable Integer id) {
        return MockPerfilDeAcesso.getPorId(id);
    }

    @PostMapping("/Perfil")
    private PerfisDeAcesso save(@RequestBody PerfisDeAcesso perfisDeAcesso) {
        return perfisDeAcesso;
    }

    @DeleteMapping("/Perfil/{id}")
    private void delete(@PathVariable Integer id) {
        MockPerfilDeAcesso.getPorId(id);
    }

    @PutMapping("/Perfil/{id}")
    private PerfisDeAcesso update(@RequestBody PerfisDeAcesso perfisDeAcesso) {
        return  MockPerfilDeAcesso.getPorId(perfisDeAcesso.getId());
    }
}
