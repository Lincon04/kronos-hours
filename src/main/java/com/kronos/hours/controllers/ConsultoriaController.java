package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.Consultoria;
import com.kronos.hours.mock.MockConsultoria;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ConsultoriaController {

    @GetMapping(value = "/Consultoria")
    private List<Consultoria> getAllConsultorias(){
        return MockConsultoria.getAll();
    }

    @GetMapping("/Consultoria/{id}")
    private Consultoria getConsultoria(@PathVariable Integer id) {
        return MockConsultoria.getPorId(id);
    }

    @PostMapping("/Consultoria")
    private Consultoria save(@RequestBody Consultoria consultoria) {

        return consultoria;
    }

    @DeleteMapping("/Consultoria/{id}")
    private void delete(@PathVariable Integer id) {
        MockConsultoria.getPorId(id);
    }

    @PutMapping("/Consultoria/{id}")
    private Consultoria update(@RequestBody Consultoria usuario) {
        return  MockConsultoria.getPorId(usuario.getId());
    }
}

