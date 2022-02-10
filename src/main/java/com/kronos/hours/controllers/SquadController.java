package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.Squad;
import com.kronos.hours.mock.MockSquad;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SquadController {

    @GetMapping(value = "/Squad")
    private List<Squad> getAllSquads(){
        return MockSquad.getAll();
    }

    @GetMapping("/Squad/{id}")
    private Squad getSquad(@PathVariable Integer id) {
        return MockSquad.getPorId(id);
    }

    @PostMapping("/Squad")
    private Squad save(@RequestBody Squad squad) {
        return squad;
    }

    @DeleteMapping("/Squad/{id}")
    private void delete(@PathVariable Integer id) {
        MockSquad.getPorId(id);
    }

    @PutMapping("/Squad/{id}")
    private Squad update(@RequestBody Squad squad) {
        return  MockSquad.getPorId(squad.getId());
    }
}
