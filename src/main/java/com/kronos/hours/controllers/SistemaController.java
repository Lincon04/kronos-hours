package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.Sistemas;
import com.kronos.hours.mock.MockSistemas;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SistemaController {

    @GetMapping(value = "/Sistemas")
    private List<Sistemas> getAllSistemas(){
        return MockSistemas.getAll();
    }

    @GetMapping("/Sistemas/{id}")
    private Sistemas getSistema(@PathVariable Integer id) {
        return MockSistemas.getPorId(id);
    }

    @PostMapping("/Sistemas")
    private Sistemas save(@RequestBody Sistemas sistemas) {
        return sistemas;
    }

    @DeleteMapping("/Sistemas/{id}")
    private void delete(@PathVariable Integer id) {
        MockSistemas.getPorId(id);
    }

    @PutMapping("/Sistemas/{id}")
    private Sistemas update(@RequestBody Sistemas sistemas) {
        return  MockSistemas.getPorId(sistemas.getId());
    }
}
