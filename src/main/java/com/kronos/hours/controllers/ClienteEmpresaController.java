package com.kronos.hours.controllers;

import com.kronos.hours.DTOS.ClienteEmpresa;
import com.kronos.hours.mock.MockClienteEmpresa;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class ClienteEmpresaController {

    @GetMapping(value = "/ClienteEmpresa")
    private List<ClienteEmpresa> getAllClienteEmpresas(){

        return MockClienteEmpresa.getAll();
    }

    @GetMapping("/ClienteEmpresa/{id}")
    private ClienteEmpresa getClienteEmpresa(@PathVariable Integer id) {
        return MockClienteEmpresa.getPorId(id);
    }

    @PostMapping("/ClienteEmpresa")
    private ClienteEmpresa save(@RequestBody ClienteEmpresa clienteEmpresa) {
        return clienteEmpresa;
    }

    @DeleteMapping("/ClienteEmpresa/{id}")
    private void delete(@PathVariable Integer id) {
        MockClienteEmpresa.getPorId(id);
    }

    @PutMapping("/ClienteEmpresa/{id}")
    private ClienteEmpresa update(@RequestBody ClienteEmpresa clienteEmpresa) {
        return  MockClienteEmpresa.getPorId(clienteEmpresa.getId());
    }
}
