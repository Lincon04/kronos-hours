package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.Chamado;
import com.kronos.hours.mock.MockChamados;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ChamadoController {

    @GetMapping(value = "/Chamado")
    private List<Chamado> getAllChamados(){
        return MockChamados.getAll();
    }

    @GetMapping("/Chamado/{id}")
    private Chamado getSquad(@PathVariable Integer id) {
        return MockChamados.getPorId(id);
    }

    @PostMapping("/Chamado")
    private Chamado save(@RequestBody Chamado chamado) {
        return chamado;
    }

    @DeleteMapping("/Chamado/{id}")
    private void delete(@PathVariable Integer id) {
        MockChamados.getPorId(id);
    }

    @PutMapping("/Chamado/{id}")
    private Chamado update(@RequestBody Chamado chamado) {
        return MockChamados.getPorId(chamado.getId());
    }
}
